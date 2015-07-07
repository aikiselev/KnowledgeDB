package model

import java.util.UUID

import com.sksamuel.elastic4s.ElasticDsl._
import com.sksamuel.elastic4s.source.Indexable
import com.sksamuel.elastic4s.{ElasticClient, ElasticDsl, HitAs, RichSearchHit}
import play.api.libs.json.Json

object SearchRepository {
  val client = ElasticClient.local
  val repo = Repository

  def createIndex = client.execute { create index "knowledge_db" }
  def deleteIndex() = client.execute { ElasticDsl.deleteIndex("knowledge_db") }

  implicit val articleFormat = Json.format[Article]
  implicit object ArticleIndexable extends Indexable[Article] {
    override def json(a: Article): String = Json.toJson(a).toString()
  }

  def indexAllArticles = client.execute  { bulk (
    repo.getArticles.map { article => {
      index into "knowledge_db" / "articles" source article
      }
    })
  }
  
  def indexArticle(article: Article) = client.execute {
    index into "knowledge_db" / "articles" source article
  }

  implicit object ArticleHitAs extends HitAs[Article] {
    override def as(hit: RichSearchHit): Article = {
      repo.getArticleByUUID(UUID.fromString(hit.sourceAsMap("id").toString))
    }
  }

  def searchInArticles(searchQuery: String) = client.execute {
    search in "knowledge_db" / "articles" query searchQuery
  }.await.as[Article]

  def updateArticleInIndex(article: Article) = {
    removeArticleFromIndex(article.id)
    indexArticle(article)
  }

  def removeArticleFromIndex(articleID: UUID) = client.execute {
    delete from "knowledge_db" types "articles" where("id:"+articleID)
  }

}
