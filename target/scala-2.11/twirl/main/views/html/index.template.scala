
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[model.Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(article: Seq[model.Article]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("test")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

"""),_display_(/*5.2*/article/*5.9*/.map/*5.13*/ { a =>_display_(Seq[Any](format.raw/*5.20*/("""
        """),format.raw/*6.9*/("""<div>
            <p>
                """),_display_(/*8.18*/a/*8.19*/.longName),format.raw/*8.28*/("""
            """),format.raw/*9.13*/("""</p>
            <p>
            """),_display_(/*11.14*/a/*11.15*/.text),format.raw/*11.20*/("""
            """),format.raw/*12.13*/("""</p>

        </div>
""")))}),format.raw/*15.2*/("""

""")))}),format.raw/*17.2*/("""
"""))}
  }

  def render(article:Seq[model.Article]): play.twirl.api.HtmlFormat.Appendable = apply(article)

  def f:((Seq[model.Article]) => play.twirl.api.HtmlFormat.Appendable) = (article) => apply(article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 18:53:21 YEKT 2015
                  SOURCE: /home/kiselev/play-scala-2.3/app/views/index.scala.html
                  HASH: aa0ca58c889ab1be9e13193175d8e56e7e7a064f
                  MATRIX: 517->1|634->30|662->33|682->45|721->47|749->50|763->57|775->61|819->68|854->77|919->116|928->117|957->126|997->139|1058->173|1068->174|1094->179|1135->192|1187->214|1220->217
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|26->5|27->6|29->8|29->8|29->8|30->9|32->11|32->11|32->11|33->12|36->15|38->17
                  -- GENERATED --
              */
          