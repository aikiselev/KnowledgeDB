
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
object sectionMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[model.Section,Seq[model.Section],Seq[model.Section],Seq[model.Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentSection: model.Section, parents: Seq[model.Section], subsections: Seq[model.Section], articles: Seq[model.Article]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.125*/("""

"""),_display_(/*3.2*/main("Section: " + currentSection.shortName)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""
    """),format.raw/*4.5*/("""<div class="container">
        """),_display_(/*5.10*/sectionMenuBreadcrumb(parents, currentSection)),format.raw/*5.56*/("""
    """),format.raw/*6.5*/("""</div>
    <div class="container">
        """),_display_(/*8.10*/searchInput()),format.raw/*8.23*/("""
    """),format.raw/*9.5*/("""</div>
    <div class="container">
        """),_display_(/*11.10*/sectionMenuSubsectionsAndArticles(subsections, articles, parents :+ currentSection)),format.raw/*11.93*/("""
    """),format.raw/*12.5*/("""</div>
    <div class="container">
        """),_display_(/*14.10*/sectionMenuAddSection(currentSection)),format.raw/*14.47*/("""
    """),format.raw/*15.5*/("""</div>
    <div class="container">
        """),_display_(/*17.10*/sectionMenuAddArticle(currentSection)),format.raw/*17.47*/("""
    """),format.raw/*18.5*/("""</div>
""")))}),format.raw/*19.2*/("""
"""))}
  }

  def render(currentSection:model.Section,parents:Seq[model.Section],subsections:Seq[model.Section],articles:Seq[model.Article]): play.twirl.api.HtmlFormat.Appendable = apply(currentSection,parents,subsections,articles)

  def f:((model.Section,Seq[model.Section],Seq[model.Section],Seq[model.Article]) => play.twirl.api.HtmlFormat.Appendable) = (currentSection,parents,subsections,articles) => apply(currentSection,parents,subsections,articles)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 13:01:06 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenu.scala.html
                  HASH: 4a92030db76f97568373207a5e1aa1c647395e00
                  MATRIX: 575->1|787->124|815->127|867->171|906->173|937->178|996->211|1062->257|1093->262|1163->306|1196->319|1227->324|1298->368|1402->451|1434->456|1505->500|1563->537|1595->542|1666->586|1724->623|1756->628|1794->636
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|29->8|29->8|30->9|32->11|32->11|33->12|35->14|35->14|36->15|38->17|38->17|39->18|40->19
                  -- GENERATED --
              */
          