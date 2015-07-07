
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
object articleViewBreadcrumb extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Section],model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parents: Seq[model.Section], article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
  <li><a href="/">Home</a></li>
  """),_display_(/*5.4*/for((p, i) <- parents.zipWithIndex) yield /*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
    """),format.raw/*6.5*/("""<li><a href="#" onclick="window.location = '/getSection?"""),_display_(/*6.62*/p/*6.63*/.id),format.raw/*6.66*/("""'">"""),_display_(/*6.70*/parents/*6.77*/.map(_.itemNumber).take(i+1).mkString(".")),format.raw/*6.119*/(""" """),_display_(/*6.121*/p/*6.122*/.longName),format.raw/*6.131*/("""</a></li>
  """)))}),format.raw/*7.4*/("""
  """),format.raw/*8.3*/("""<li class="active">"""),_display_(/*8.23*/article/*8.30*/.itemNumber),format.raw/*8.41*/(""". """),_display_(/*8.44*/article/*8.51*/.shortName),format.raw/*8.61*/("""</li>
</ol>
"""))}
  }

  def render(parents:Seq[model.Section],article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(parents,article)

  def f:((Seq[model.Section],model.Article) => play.twirl.api.HtmlFormat.Appendable) = (parents,article) => apply(parents,article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleViewBreadcrumb.scala.html
                  HASH: 3d669eeef273242ff86f4ac9be21bf5e8ec6b14c
                  MATRIX: 547->1|688->54|716->56|800->115|850->150|889->152|920->157|1003->214|1012->215|1035->218|1065->222|1080->229|1143->271|1172->273|1182->274|1212->283|1254->296|1283->299|1329->319|1344->326|1375->337|1404->340|1419->347|1449->357
                  LINES: 19->1|22->1|24->3|26->5|26->5|26->5|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|28->7|29->8|29->8|29->8|29->8|29->8|29->8|29->8
                  -- GENERATED --
              */
          