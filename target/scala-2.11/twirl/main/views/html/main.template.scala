
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

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="""),_display_(/*12.32*/routes/*12.38*/.Assets.at("favicon.ico")),format.raw/*12.63*/(""">

        <title>Starter Template for Bootstrap</title>

            <!-- Bootstrap core CSS -->
        <link href="""),_display_(/*17.21*/routes/*17.27*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*17.72*/(""" """),format.raw/*17.73*/("""rel="stylesheet">

            <!-- Custom styles for this template -->
        <link href="""),_display_(/*20.21*/routes/*20.27*/.Assets.at("starter-template.css")),format.raw/*20.61*/(""" """),format.raw/*20.62*/("""rel="stylesheet">

            <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>


    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Project name</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#contact">Contact</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        """),_display_(/*53.10*/content),format.raw/*53.17*/("""
        """),format.raw/*54.9*/("""<div class="container">

            <input id="title"> Название </input>
            <input id="articleContent"> текст </input>

            <div class="starter-template">
                <p class="lead"><button type="button" class="btn btn-lg btn-default" id="submit"><a href="#">"""),_display_(/*60.111*/title),format.raw/*60.116*/("""</a></button></p>
            </div>



        </div><!-- /.container -->

        <!-- Bootstrap core JavaScript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="""),_display_(/*71.22*/routes/*71.28*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*71.71*/("""></script>
            <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="""),_display_(/*73.22*/routes/*73.28*/.Assets.at("bootstrap/js/ie10-viewport-bug-workaround.js")),format.raw/*73.86*/("""></script>

        <script>
            $( document ).ready(function() """),format.raw/*76.44*/("""{"""),format.raw/*76.45*/("""
                """),format.raw/*77.17*/("""console.log( "ready!" );
                $("#submit").click(function()"""),format.raw/*78.46*/("""{"""),format.raw/*78.47*/("""
                    """),format.raw/*79.21*/("""var data = """),format.raw/*79.32*/("""{"""),format.raw/*79.33*/("""
                        """),format.raw/*80.25*/("""title: $("#title").val(),
                        content: $("#title").val()
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/(""";
                    $.ajax("""),format.raw/*83.28*/("""{"""),format.raw/*83.29*/("""
                      """),format.raw/*84.23*/("""type: "POST",
                      url: """"),_display_(/*85.30*/controllers/*85.41*/.routes.Application.addArticle()),format.raw/*85.73*/("""",
                      data: JSON.stringify(data),
                      success: alert("posted"),
                      dataType:'application/json',
                      contentType : 'application/json'
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/(""");
                """),format.raw/*91.17*/("""}"""),format.raw/*91.18*/(""");
            """),format.raw/*92.13*/("""}"""),format.raw/*92.14*/(""");

            </script>
    </body>

</html>

"""),format.raw/*99.20*/("""

"""),format.raw/*101.11*/("""
    """),format.raw/*102.15*/("""
        """),format.raw/*103.34*/("""
        """),format.raw/*104.100*/("""
        """),format.raw/*105.103*/("""
        """),format.raw/*106.101*/("""
    """),format.raw/*107.16*/("""
    """),format.raw/*108.15*/("""
        """),format.raw/*109.20*/("""
    """),format.raw/*110.16*/("""
"""),format.raw/*111.12*/("""
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 18:33:36 YEKT 2015
                  SOURCE: /home/kiselev/play-scala-2.3/app/views/main.scala.html
                  HASH: f038a1702538cc65e3944530f6f6dd47887c2ae5
                  MATRIX: 509->1|627->31|655->33|1138->489|1153->495|1199->520|1344->638|1359->644|1425->689|1454->690|1573->782|1588->788|1643->822|1672->823|3146->2270|3174->2277|3210->2286|3521->2569|3548->2574|3944->2943|3959->2949|4023->2992|4156->3098|4171->3104|4250->3162|4350->3234|4379->3235|4424->3252|4522->3322|4551->3323|4600->3344|4639->3355|4668->3356|4721->3381|4846->3478|4875->3479|4932->3508|4961->3509|5012->3532|5082->3575|5102->3586|5155->3618|5410->3845|5439->3846|5486->3865|5515->3866|5558->3881|5587->3882|5663->3949|5694->3961|5728->3976|5766->4010|5805->4110|5844->4213|5883->4314|5917->4330|5951->4345|5989->4365|6023->4381|6053->4393
                  LINES: 19->1|22->1|24->3|33->12|33->12|33->12|38->17|38->17|38->17|38->17|41->20|41->20|41->20|41->20|74->53|74->53|75->54|81->60|81->60|92->71|92->71|92->71|94->73|94->73|94->73|97->76|97->76|98->77|99->78|99->78|100->79|100->79|100->79|101->80|103->82|103->82|104->83|104->83|105->84|106->85|106->85|106->85|111->90|111->90|112->91|112->91|113->92|113->92|120->99|122->101|123->102|124->103|125->104|126->105|127->106|128->107|129->108|130->109|131->110|132->111
                  -- GENERATED --
              */
          