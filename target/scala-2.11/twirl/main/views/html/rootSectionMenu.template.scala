
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

"""),format.raw/*3.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="""),_display_(/*4.14*/routes/*4.20*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*4.63*/("""></script>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="""),_display_(/*12.32*/routes/*12.38*/.Assets.at("favicon.ico")),format.raw/*12.63*/(""">

        <title>Root Sections</title>

            <!-- Bootstrap core CSS -->
        <link href="""),_display_(/*17.21*/routes/*17.27*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*17.72*/(""" """),format.raw/*17.73*/("""rel="stylesheet">

            <!-- Custom styles for this template -->
        <link href="""),_display_(/*20.21*/routes/*20.27*/.Assets.at("starter-template.css")),format.raw/*20.61*/(""" """),format.raw/*20.62*/("""rel="stylesheet">

    </head>

    <body>

        <ol class="breadcrumb">
            <li class="active">Home</li>
        </ol>

"""),_display_(/*30.2*/sectionMenuSubsectionsAndArticles(subsections, List[model.Article]())),format.raw/*30.71*/("""
"""),_display_(/*31.2*/rootSectionMenuAddSection()),format.raw/*31.29*/("""
"""),_display_(/*32.2*/rootSectionMenuSearch()),format.raw/*32.25*/("""

    """),format.raw/*34.5*/("""</body>
</html>
"""))}
  }

  def render(subsections:Seq[model.Section]): play.twirl.api.HtmlFormat.Appendable = apply(subsections)

  def f:((Seq[model.Section]) => play.twirl.api.HtmlFormat.Appendable) = (subsections) => apply(subsections)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/rootSectionMenu.scala.html
                  HASH: ab47664f0d514b6153548ef63f1429bbe55edc7e
                  MATRIX: 527->1|648->34|676->36|805->139|819->145|882->188|1166->445|1181->451|1227->476|1355->577|1370->583|1436->628|1465->629|1584->721|1599->727|1654->761|1683->762|1842->895|1932->964|1960->966|2008->993|2036->995|2080->1018|2113->1024
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|33->12|33->12|33->12|38->17|38->17|38->17|38->17|41->20|41->20|41->20|41->20|51->30|51->30|52->31|52->31|53->32|53->32|55->34
                  -- GENERATED --
              */
          