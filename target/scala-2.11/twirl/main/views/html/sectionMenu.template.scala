
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

"""),format.raw/*3.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="""),_display_(/*4.14*/routes/*4.20*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*4.63*/("""></script>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="icon" href="""),_display_(/*12.32*/routes/*12.38*/.Assets.at("favicon.ico")),format.raw/*12.63*/(""">

        <title>Section: """),_display_(/*14.26*/currentSection/*14.40*/.shortName),format.raw/*14.50*/("""</title>

        <link href="""),_display_(/*16.21*/routes/*16.27*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*16.72*/(""" """),format.raw/*16.73*/("""rel="stylesheet">

        <link href="""),_display_(/*18.21*/routes/*18.27*/.Assets.at("starter-template.css")),format.raw/*18.61*/(""" """),format.raw/*18.62*/("""rel="stylesheet">

    </head>

    <body>

    """),_display_(/*24.6*/sectionMenuBreadcrumb(parents, currentSection)),format.raw/*24.52*/("""
    """),_display_(/*25.6*/sectionMenuSubsectionsAndArticles(subsections, articles)),format.raw/*25.62*/("""
    """),_display_(/*26.6*/sectionMenuAddSection(currentSection)),format.raw/*26.43*/("""
    """),_display_(/*27.6*/sectionMenuAddArticle(currentSection)),format.raw/*27.43*/("""
    """),format.raw/*28.5*/("""</body>
</html>
"""))}
  }

  def render(currentSection:model.Section,parents:Seq[model.Section],subsections:Seq[model.Section],articles:Seq[model.Article]): play.twirl.api.HtmlFormat.Appendable = apply(currentSection,parents,subsections,articles)

  def f:((model.Section,Seq[model.Section],Seq[model.Section],Seq[model.Article]) => play.twirl.api.HtmlFormat.Appendable) = (currentSection,parents,subsections,articles) => apply(currentSection,parents,subsections,articles)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenu.scala.html
                  HASH: 989bce558b2df2d778c815cafb089445e56fcab1
                  MATRIX: 575->1|787->124|815->126|944->229|958->235|1021->278|1290->520|1305->526|1351->551|1406->579|1429->593|1460->603|1517->633|1532->639|1598->684|1627->685|1693->724|1708->730|1763->764|1792->765|1867->814|1934->860|1966->866|2043->922|2075->928|2133->965|2165->971|2223->1008|2255->1013
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|33->12|33->12|33->12|35->14|35->14|35->14|37->16|37->16|37->16|37->16|39->18|39->18|39->18|39->18|45->24|45->24|46->25|46->25|47->26|47->26|48->27|48->27|49->28
                  -- GENERATED --
              */
          