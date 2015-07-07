
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
object articleView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Section],model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parents: Seq[model.Section], article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Article: " + article.shortName)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""
    """),format.raw/*4.5*/("""<div class="container">
    """),_display_(/*5.6*/articleViewBreadcrumb(parents, article)),format.raw/*5.45*/("""
    """),format.raw/*6.5*/("""</div>
    <div class="container">
    """),_display_(/*8.6*/articleViewBody(article)),format.raw/*8.30*/("""
    """),format.raw/*9.5*/("""</div>
    <div class="container">
    """),_display_(/*11.6*/articleViewChangeArticle(article)),format.raw/*11.39*/("""
    """),format.raw/*12.5*/("""</div>
""")))}))}
  }

  def render(parents:Seq[model.Section],article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(parents,article)

  def f:((Seq[model.Section],model.Article) => play.twirl.api.HtmlFormat.Appendable) = (parents,article) => apply(parents,article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 10:52:37 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleView.scala.html
                  HASH: f76ebc8889506632ce02c1fe898ef4b420b093c6
                  MATRIX: 537->1|678->54|706->57|751->94|790->96|821->101|875->130|934->169|965->174|1030->214|1074->238|1105->243|1171->283|1225->316|1257->321
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|29->8|29->8|30->9|32->11|32->11|33->12
                  -- GENERATED --
              */
          