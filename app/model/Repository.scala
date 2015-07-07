package model

import java.util.UUID

import org.squeryl.PrimitiveTypeMode._


object Repository {

  private val schema = KnowledgeSchema
  private val articles = schema.articles
  private val sections = schema.sections

  def init() = transaction {
    schema.create
  }

  def xmlWasImported = transaction {
    from(schema.importStatus)(s => where(s.was === true) select s).nonEmpty
  }

  def setXmlImportFlag(): Unit = transaction {
    schema.importStatus.insert(XmlImported(true))
  }

  def addArticle(a: Article) = transaction {
    a.itemNumber = getNumberOfArticles(a.sectionID) + 1
    articles.insert(a)
    SearchRepository.indexArticle(a)
  }

  def getNumberOfArticles(sectionUUID: UUID) = getArticlesByUUID(sectionUUID).length

  def getArticlesByUUID(sectionUUID: UUID) = transaction {
    from(articles)(a => where(a.sectionID === sectionUUID) select a).toList.sortBy(_.itemNumber)
  }

  def getArticles = transaction {
    from(articles)(a => select(a)).toList
  }

  def updateArticle(uuid: UUID, name: String, text: String) = {
    transaction {
      update(articles)(
        article => where(article.id === uuid)
          set(article.longName := name,
          article.shortName := name.take(10),
          article.text := text)
      )
    }
    SearchRepository.updateArticleInIndex(getArticleByUUID(uuid))
  }

  def getArticleByUUID(uuid: UUID) = transaction {
    from(articles)(a => where(a.id === uuid) select a).head
  }

  def removeArticleByUUID(uuid: UUID) = {
     {
      val sectionID = getArticleByUUID(uuid).sectionID
      transaction {
       articles.deleteWhere(a => a.id === uuid)
      }
      SearchRepository.removeArticleFromIndex(uuid)
      fixArticleItemNumbers(sectionID)
    }
  }

  private def fixArticleItemNumbers(sectionUUID: UUID) = transaction {
    for ((article, index) <- getArticlesByUUID(sectionUUID).zipWithIndex) {
      article.itemNumber = index + 1
      articles.update(article)
      //        update(articles) { a =>
      //          where(a.id === article.id)
      //          set(a.itemNumber := index + 1)
      //        }
    }
  }

  def addSection(section: Section) = transaction {
    if (section.isRoot) {
      section.itemNumber = getRootSections.length + 1
    }
    else {
      section.itemNumber = getNumberOfChildSections(section.parentID) + 1
    }
    sections.insert(section)
  }

  def getRootSections = transaction {
    from(sections)(s => where(s.id === s.parentID) select s).toList
  }

  def getNumberOfChildSections(uuid: UUID) = getChildSectionsByUUID(uuid).length

  def getChildSectionsByUUID(uuid: UUID) = transaction {
    from(sections)(s => where(s.parentID === uuid and not(s.id === s.parentID)) select s).toList
  }

  def getSections = transaction {
    from(sections)(s => select(s)).toList
  }

//  def moveArticleToSection(articleUUID: UUID, sectionUUID: UUID): Unit = transaction {
//    val article = getArticleByUUID(articleUUID)
//    article.sectionID := sectionUUID
//    articles.update(article)
//  }

  def getSectionParentsByUUID(uuid: UUID): List[Section] = transaction {
    var result = List[Section]()

    if (getSectionByUUID(uuid).isRoot) return result

    var currentParent = getSectionByUUID(getSectionByUUID(uuid).parentID)
    while (!currentParent.isRoot) {
      result ::= currentParent
      currentParent = getSectionByUUID(currentParent.parentID)
    }
    result ::= currentParent
    result
  }

  def getSectionByUUID(uuid: UUID) = transaction {
    from(sections)(s => where(s.id === uuid) select s).head
  }

  def removeSectionByUUID(uuid: UUID): Unit = {
    val section = getSectionByUUID(uuid)
    transaction {
      deleteSectionAndChildrenByUUID(uuid)
    }
    transaction {
      if (section.isRoot)
        fixRootItemNumbers()
      else
        fixParentChildItemNumbers(section.parentID)
    }
  }


  private def fixRootItemNumbers() =
    for((section, index) <- getRootSections.zipWithIndex)
      transaction {
        update (sections)(s =>
          where (s.id === section.id)
          set (s.itemNumber := index + 1))
      }

  private def deleteSectionAndChildrenByUUID(uuid: UUID) {
    val childSections = getChildSectionsByUUID(uuid)
    for (child <- childSections)
      deleteSectionAndChildrenByUUID(child.id)
    val articles = getArticlesByUUID(uuid)
    for (article <- articles)
      removeArticleByUUID(article.id)
    sections.deleteWhere(s => s.id === uuid)
  }

  private def fixParentChildItemNumbers(parentID: UUID) = {
    for((section, index) <- getChildSectionsByUUID(parentID).zipWithIndex) {
      transaction {
        update(sections)(s =>
          where(s.id === section.id)
            set (s.itemNumber := index + 1))
      }
    }
  }


}
