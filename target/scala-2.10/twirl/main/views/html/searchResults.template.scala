
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object searchResults extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Seq[model.Article],String,Seq[Seq[model.Section]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: Seq[model.Article], query: String, articlesParents: Seq[Seq[model.Section]]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.89*/("""

"""),_display_(/*3.2*/main("Search")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""

  """),format.raw/*5.3*/("""<div class="container">
    <ol class="breadcrumb">
      <li><a href="/">Home</a></li>
    </ol>
  </div>

  <div class="container">
    <div class="jumbotron">
      <h3>Searching for query: """"),_display_(/*13.34*/query),format.raw/*13.39*/("""". Found """),_display_(/*13.49*/articles/*13.57*/.length),format.raw/*13.64*/(""" """),format.raw/*13.65*/("""results:</h3>
      """),_display_(/*14.8*/for((article, parents) <- articles zip articlesParents) yield /*14.63*/ {_display_(Seq[Any](format.raw/*14.65*/("""
        """),format.raw/*15.9*/("""<h4>"""),_display_(/*15.14*/parents/*15.21*/.map(_.itemNumber).mkString(".")),format.raw/*15.53*/(""" """),_display_(/*15.55*/article/*15.62*/.itemNumber),format.raw/*15.73*/(""". """),_display_(/*15.76*/article/*15.83*/.longName),format.raw/*15.92*/("""</h4>
        <h5>"""),_display_(/*16.14*/article/*16.21*/.text),format.raw/*16.26*/("""</h5>
      """)))}),format.raw/*17.8*/("""
    """),format.raw/*18.5*/("""</div>
  </div>

""")))}))}
  }

  def render(articles:Seq[model.Article],query:String,articlesParents:Seq[Seq[model.Section]]): play.twirl.api.HtmlFormat.Appendable = apply(articles,query,articlesParents)

  def f:((Seq[model.Article],String,Seq[Seq[model.Section]]) => play.twirl.api.HtmlFormat.Appendable) = (articles,query,articlesParents) => apply(articles,query,articlesParents)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 12:19:41 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/searchResults.scala.html
                  HASH: e227e3bb855510e39964ab7941382fd8f72cf040
                  MATRIX: 556->1|731->88|759->91|781->105|820->107|850->111|1072->306|1098->311|1135->321|1152->329|1180->336|1209->337|1256->358|1327->413|1367->415|1403->424|1435->429|1451->436|1504->468|1533->470|1549->477|1581->488|1611->491|1627->498|1657->507|1703->526|1719->533|1745->538|1788->551|1820->556
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|34->13|34->13|34->13|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|36->15|37->16|37->16|37->16|38->17|39->18
                  -- GENERATED --
              */
          