
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
object searchResults extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Article],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: Seq[model.Article], query: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*3.1*/("""<h1>Searching for query: """),_display_(/*3.27*/query),format.raw/*3.32*/(""". Found """),_display_(/*3.41*/articles/*3.49*/.length),format.raw/*3.56*/(""" """),format.raw/*3.57*/("""results:</h1>
"""),_display_(/*4.2*/for(article <- articles) yield /*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
  """),format.raw/*5.3*/("""<h2>"""),_display_(/*5.8*/article/*5.15*/.longName),format.raw/*5.24*/("""</h2>
  <h3>"""),_display_(/*6.8*/article/*6.15*/.text),format.raw/*6.20*/("""</h3>
""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(articles:Seq[model.Article],query:String): play.twirl.api.HtmlFormat.Appendable = apply(articles,query)

  def f:((Seq[model.Article],String) => play.twirl.api.HtmlFormat.Appendable) = (articles,query) => apply(articles,query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/searchResults.scala.html
                  HASH: 7b0be1f8e31f60d39e8e2fa41dd9a298470f5f79
                  MATRIX: 532->1|665->46|693->48|745->74|770->79|805->88|821->96|848->103|876->104|916->119|955->143|994->145|1023->148|1053->153|1068->160|1097->169|1135->182|1150->189|1175->194|1211->201
                  LINES: 19->1|22->1|24->3|24->3|24->3|24->3|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|26->5|27->6|27->6|27->6|28->7
                  -- GENERATED --
              */
          