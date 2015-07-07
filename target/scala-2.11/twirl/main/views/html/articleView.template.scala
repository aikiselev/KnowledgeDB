
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

        <title>Article: """),_display_(/*16.26*/article/*16.33*/.shortName),format.raw/*16.43*/("""</title>

            <!-- Bootstrap core CSS -->
        <link href="""),_display_(/*19.21*/routes/*19.27*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*19.72*/(""" """),format.raw/*19.73*/("""rel="stylesheet">

            <!-- Custom styles for this template -->
        <link href="""),_display_(/*22.21*/routes/*22.27*/.Assets.at("starter-template.css")),format.raw/*22.61*/(""" """),format.raw/*22.62*/("""rel="stylesheet">

    </head>

    <body>

    """),_display_(/*28.6*/articleViewBreadcrumb(parents, article)),format.raw/*28.45*/("""
    """),_display_(/*29.6*/articleViewBody(article)),format.raw/*29.30*/("""
    """),_display_(/*30.6*/articleViewChangeArticle(article)),format.raw/*30.39*/("""
    """),format.raw/*31.5*/("""</body>
</html>
"""))}
  }

  def render(parents:Seq[model.Section],article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(parents,article)

  def f:((Seq[model.Section],model.Article) => play.twirl.api.HtmlFormat.Appendable) = (parents,article) => apply(parents,article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleView.scala.html
                  HASH: f8ccb680e04e8386897d2a85ab37ea0ab747630f
                  MATRIX: 537->1|678->54|706->56|835->159|849->165|912->208|1391->660|1406->666|1452->691|1507->719|1523->726|1554->736|1651->806|1666->812|1732->857|1761->858|1880->950|1895->956|1950->990|1979->991|2054->1040|2114->1079|2146->1085|2191->1109|2223->1115|2277->1148|2309->1153
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|35->14|35->14|35->14|37->16|37->16|37->16|40->19|40->19|40->19|40->19|43->22|43->22|43->22|43->22|49->28|49->28|50->29|50->29|51->30|51->30|52->31
                  -- GENERATED --
              */
          