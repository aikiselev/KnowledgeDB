package model

import java.util.UUID

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{KeyedEntity, Schema}
import org.squeryl.dsl.{ManyToOne, OneToMany}

case class Article(id:UUID = UUID.randomUUID(),
                   shortName:String,
                   longName:String,
                   text:String,
                   sectionID:UUID,
                   var itemNumber: Int = 0) extends KeyedEntity[UUID] {
  lazy val section: ManyToOne[Section] = KnowledgeSchema.sectionsToArticles.right(this)
}

case class Section(id:UUID = UUID.randomUUID(),
                   shortName:String,
                   longName:String,
                   var itemNumber: Int = 0) extends KeyedEntity[UUID] {
  var parentID: UUID = id
  lazy val articles: OneToMany[Article] = KnowledgeSchema.sectionsToArticles.left(this)
  lazy val isRoot = id == parentID
}

case class XmlImported(was: Boolean)

object KnowledgeSchema extends Schema {

  val articles = table[Article]
  val sections = table[Section]
  val importStatus = table[XmlImported] // if empty then the table was not init by xml

  val sectionsToArticles =
    oneToManyRelation(sections, articles)
    .via((s, a) => a.sectionID === s.id)

  on(articles)(a => declare(
    a.id is(indexed, unique),
    a.text is dbType("text")
  ))

  on(sections)(s => declare(
    s.id is(indexed, unique)
  ))

}