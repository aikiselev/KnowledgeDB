import model._
import org.squeryl.adapters.PostgreSqlAdapter
import org.squeryl.{Session, SessionFactory}
import play.api.db.DB
import play.api.{Application, GlobalSettings}

object Global extends GlobalSettings {
  override def onStart(app: Application) {
    SessionFactory.concreteFactory = Some(() => Session.create(DB.getConnection()(app), new PostgreSqlAdapter))

    LoadDBfromXML.load()

    SearchRepository.createIndex
    SearchRepository.indexAllArticles
  }

  override def onStop(app: Application): Unit = {
    SearchRepository.deleteIndex()
  }
}