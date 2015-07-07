package model

import scala.xml.XML

class SaveDBtoXML(xmlDBFilePath: String = "./app/assets/db.xml") {
  val repo = Repository

  def save(): Unit = {
    val xml =
      <xml>
        <sections>
          {for(section <- repo.getSections) yield
          <section>
            <id>{section.id}</id>
            <shortName>{section.shortName}</shortName>
            <longName>{section.longName}</longName>
            <itemNumber>{section.itemNumber}</itemNumber>
            <parentID>{section.parentID}</parentID>
          </section>
          }
        </sections>
        <articles>
          {for(article <- repo.getArticles) yield
          <article>
            <id>{article.id}</id>
            <shortName>{article.shortName}</shortName>
            <longName>{article.longName}</longName>
            <sectionID>{article.sectionID}</sectionID>
            <itemNumber>{article.itemNumber}</itemNumber>
            <text>{article.text}</text>
          </article>
          }
        </articles>
      </xml>
    XML.save(xmlDBFilePath, xml, "UTF-8")
  }
}
