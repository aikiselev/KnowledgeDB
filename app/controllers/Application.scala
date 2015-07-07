package controllers

import java.util.UUID

import model.{Article, Section}
import play.api.libs.json.{JsError, Json}
import play.api.mvc._

object Application extends Controller {

  val repo = model.Repository
  val searcher = model.SearchRepository

  def index = Action {
    //searcher.indexAllArticles
    Ok(views.html.rootSectionMenu(repo.getRootSections))
  }

  case class RootSectionJsonData(name:String)
  def addRootSection() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val AddSectionJsonDataFormat = Json.format[RootSectionJsonData]
    val res = rc.body.validate[RootSectionJsonData]
    res.fold(
      errors => {
        BadRequest(Json.obj("status" -> "KO", "message" -> JsError.toFlatJson(errors)))
      },
      section => {
        repo.addSection( Section(shortName = section.name.take(42), longName = section.name) )
        Ok(Json.obj("status" -> "OK", "message" -> "Section saved." ))
      }
    )
  }

  def addSection() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val AddSectionJsonDataFormat = Json.format[SectionJsonData]
    val res = rc.body.validate[SectionJsonData]
    res.fold(
      errors => {
        BadRequest(Json.obj("status" -> "KO", "message" -> JsError.toFlatJson(errors)))
      },
      sectionData => {
        val section = Section(shortName = sectionData.name.take(42), longName = sectionData.name)
        section.parentID = UUID.fromString(sectionData.parentID)
        repo.addSection(section)
        Ok(Json.obj("status" -> "OK", "message" -> "Section saved." ))
      }
    )
  }

  def sectionMenu = Action { implicit rc =>
    val sectionID = UUID.fromString(rc.rawQueryString)
    val parents = repo.getSectionParentsByUUID(sectionID)
    val subsections = repo.getChildSectionsByUUID(sectionID)
    val articles = repo.getArticlesByUUID(sectionID)
    Ok(views.html.sectionMenu(repo.getSectionByUUID(sectionID), parents, subsections, articles))
  }

  def removeSection() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val RemoveSectionJsonDataFormat = Json.format[UUIDJsonData]
    val res = rc.body.validate[UUIDJsonData]
    res.fold(
      errors => {
        BadRequest(Json.obj("status" -> "KO", "message" -> JsError.toFlatJson(errors)))
      },
      section => {
        val sectionUUID = UUID.fromString(section.uuid)
        repo.removeSectionByUUID(sectionUUID)
        Ok(Json.obj("status" -> "OK", "message" -> "Section removed." ))
      }
    )
  }

  case class ArticleJsonData(name: String, text: String, sectionID:String)
  def addArticle() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val AddArticleJsonDataFormat = Json.format[ArticleJsonData]

    val res = rc.body.validate[ArticleJsonData]
    res.fold(
    errors => {
        BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toFlatJson(errors)))
      },
    article => {
        repo.addArticle(
        Article(shortName = article.name.take(42),
        longName = article.name,
        text = article.text,
        sectionID = UUID.fromString(article.sectionID))
        )
        Ok(Json.obj("status" -> "OK", "message" -> "Article saved." ))
      }
    )
  }

  def articleView = Action { implicit rc =>
    val articleID = UUID.fromString(rc.rawQueryString)
    val article = repo.getArticleByUUID(articleID)
    val parents = repo.getSectionParentsByUUID(article.sectionID)
    Ok(views.html.articleView(parents :+ repo.getSectionByUUID(article.sectionID), article))
  }

  def editArticle = Action { implicit rc =>
    val articleID = UUID.fromString(rc.rawQueryString)
    val article = repo.getArticleByUUID(articleID)
    val parents = repo.getSectionParentsByUUID(article.sectionID)
    Ok(views.html.editArticle(parents :+ repo.getSectionByUUID(article.sectionID), article))
  }

  case class UpdateArticleJsonData(uuid: String, name: String, text: String)
  def updateArticle() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val AddArticleJsonDataFormat = Json.format[UpdateArticleJsonData]

    val res = rc.body.validate[UpdateArticleJsonData]
    res.fold(
      errors => {
        BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toFlatJson(errors)))
      },
      article => {
        repo.updateArticle(UUID.fromString(article.uuid), article.name, article.text)
        Ok(Json.obj("status" -> "OK", "message" -> "Article updated." ))
      }
    )
  }

  def removeArticle() = Action(BodyParsers.parse.json) { implicit rc =>
    implicit val RemoveArticleJsonDataFormat = Json.format[UUIDJsonData]
    val res = rc.body.validate[UUIDJsonData]
    res.fold(
      errors => {
        BadRequest(Json.obj("status" -> "KO", "message" -> JsError.toFlatJson(errors)))
      },
      article => {
        val articleUUID = UUID.fromString(article.uuid)
        repo.removeArticleByUUID(articleUUID)
        Ok(Json.obj("status" -> "OK", "message" -> "Article removed." ))
      }
    )
  }

  def search = Action { implicit rc =>
    val query:String = play.core.parsers.FormUrlEncodedParser.parse(rc.rawQueryString)("query").head
    val searchResults = searcher.searchInArticles(query)
    val parentsForResults =
      for(article <- searchResults; sectionID = article.sectionID)
        yield repo.getSectionParentsByUUID(sectionID) :+ repo.getSectionByUUID(sectionID)
    Ok(views.html.searchResults(searchResults, query, parentsForResults))
  }

  def exportToXML = Action {
    new model.SaveDBtoXML().save()
    Ok("db saved")
  }

  case class UUIDJsonData(uuid:String)
  case class SectionJsonData(name: String, parentID: String)
}



