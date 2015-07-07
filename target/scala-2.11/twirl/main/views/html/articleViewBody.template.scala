
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
        <p>"""),_display_(/*7.13*/article/*7.20*/.text),format.raw/*7.25*/("""</p>
    </div>
</div>"""))}
  }

  def render(article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(article)

  def f:((model.Article) => play.twirl.api.HtmlFormat.Appendable) = (article) => apply(article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleViewBody.scala.html
                  HASH: 8b911bcb983b7ec96f26d0778d4d67b541f494d3
                  MATRIX: 522->1|634->25|663->28|754->93|769->100|798->109|842->127|857->134|882->139
                  LINES: 19->1|22->1|25->4|27->6|27->6|27->6|28->7|28->7|28->7
                  -- GENERATED --
              */
          