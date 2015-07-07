
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
object articleViewBody extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""


"""),format.raw/*4.1*/("""<div class="jumbotron">
        <div class="container">
        <h1>"""),_display_(/*6.14*/article/*6.21*/.longName),format.raw/*6.30*/("""</h1>
        """),_display_(/*7.10*/for(line <- article.text.lines) yield /*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""
                """),format.raw/*8.17*/("""<p>"""),_display_(/*8.21*/line),format.raw/*8.25*/("""</p>
        """)))}),format.raw/*9.10*/("""
        """),format.raw/*10.9*/("""</div>
</div>"""))}
  }

  def render(article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(article)

  def f:((model.Article) => play.twirl.api.HtmlFormat.Appendable) = (article) => apply(article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 10:58:08 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleViewBody.scala.html
                  HASH: 22cb0537e12044877220b40a33531ea5937e742c
                  MATRIX: 522->1|634->25|663->28|758->97|773->104|802->113|843->128|889->159|928->161|972->178|1002->182|1026->186|1070->200|1106->209
                  LINES: 19->1|22->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|31->10
                  -- GENERATED --
              */
          