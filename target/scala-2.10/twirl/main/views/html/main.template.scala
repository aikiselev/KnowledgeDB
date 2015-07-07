
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="""),_display_(/*4.14*/routes/*4.20*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*4.63*/("""></script>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="""),_display_(/*14.32*/routes/*14.38*/.Assets.at("favicon.ico")),format.raw/*14.63*/(""">

        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/(""" """),format.raw/*16.23*/("""</title>

            <!-- Bootstrap core CSS -->
        <link href="""),_display_(/*19.21*/routes/*19.27*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*19.72*/(""" """),format.raw/*19.73*/("""rel="stylesheet">

            <!-- Custom styles for this template -->
        <link href="""),_display_(/*22.21*/routes/*22.27*/.Assets.at("starter-template.css")),format.raw/*22.61*/(""" """),format.raw/*22.62*/("""rel="stylesheet">

    </head>

    <body>

    """),_display_(/*28.6*/content),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 18:25:56 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/main.scala.html
                  HASH: f6b56fd81286b92d2a9b9a9147ec51b76a18c021
                  MATRIX: 509->1|627->31|655->33|784->136|798->142|861->185|1340->637|1355->643|1401->668|1447->687|1473->692|1502->693|1599->763|1614->769|1680->814|1709->815|1828->907|1843->913|1898->947|1927->948|2002->997|2030->1004|2063->1010
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|35->14|35->14|35->14|37->16|37->16|37->16|40->19|40->19|40->19|40->19|43->22|43->22|43->22|43->22|49->28|49->28|51->30
                  -- GENERATED --
              */
          