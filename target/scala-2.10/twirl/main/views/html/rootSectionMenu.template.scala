
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
object rootSectionMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[model.Section],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subsections: Seq[model.Section]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Root sections")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <ol class="breadcrumb">
            <li class="active">Home</li>
        </ol>
    </div>

    <div class="container">
        """),_display_(/*11.10*/searchInput()),format.raw/*11.23*/("""
    """),format.raw/*12.5*/("""</div>

    <div class="container">
        """),_display_(/*15.10*/sectionMenuSubsectionsAndArticles(subsections, List[model.Article](), List[model.Section]())),format.raw/*15.102*/("""
    """),format.raw/*16.5*/("""</div>

    <div class="container">
        """),_display_(/*19.10*/rootSectionMenuAddSection()),format.raw/*19.37*/("""
    """),format.raw/*20.5*/("""</div>
""")))}),format.raw/*21.2*/("""

"""))}
  }

  def render(subsections:Seq[model.Section]): play.twirl.api.HtmlFormat.Appendable = apply(subsections)

  def f:((Seq[model.Section]) => play.twirl.api.HtmlFormat.Appendable) = (subsections) => apply(subsections)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 13:00:23 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/rootSectionMenu.scala.html
                  HASH: cb0052833ef1e65763a6cd38b34cbf8ed3bf238d
                  MATRIX: 527->1|648->34|676->37|705->58|744->60|775->65|962->225|996->238|1028->243|1100->288|1214->380|1246->385|1318->430|1366->457|1398->462|1436->470
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|32->11|32->11|33->12|36->15|36->15|37->16|40->19|40->19|41->20|42->21
                  -- GENERATED --
              */
          