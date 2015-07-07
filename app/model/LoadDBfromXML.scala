package model

import java.util.UUID

import scala.xml.NodeSeq

object LoadDBfromXML {
  val xmlDBFilePath = "./app/assets/db.xml"
  val repo = Repository
  def xmlWasImported = repo.xmlWasImported

  def load() = {
    if (!xmlWasImported) {
      val xmlDB = scala.xml.XML.loadFile(xmlDBFilePath)
      val sectionNodes = (xmlDB \ "sections") \ "section"
      loadSections(sectionNodes)
      val articleNodes = (xmlDB \ "articles") \ "article"
      loadArticles(articleNodes)
      repo.setXmlImportFlag()
    }
  }

  private def loadSections(sectionNodes: NodeSeq): Unit = {
    for (sectionNode <- sectionNodes) {
      val uuid = UUID.fromString(sectionNode \ "id" text)
      val shortName = sectionNode \ "shortName" text
      val longName = sectionNode \ "shortName" text
      val parentUUID = UUID.fromString(sectionNode \ "parentID" text)
      val itemNumber = (sectionNode \ "itemNumber" text).toInt

      val section = Section(id = uuid, shortName = shortName, longName = longName, itemNumber = itemNumber)
      section.parentID = parentUUID
      repo.addSection(section)
    }
  }

  private def loadArticles(articleNodes: NodeSeq): Unit = {
    for (articleNode <- articleNodes) {
      val uuid = UUID.fromString(articleNode \ "id" text)
      val shortName = articleNode \ "shortName" text
      val longName = articleNode \ "shortName" text
      val sectionID = UUID.fromString(articleNode \ "sectionID" text)
      val itemNumber = (articleNode \ "itemNumber" text).toInt
      val text = articleNode \ "text" text

      val article = Article(id = uuid, shortName = shortName, longName = longName, text = text, sectionID = sectionID, itemNumber = itemNumber)
      repo.addArticle(article)
    }
  }
}
