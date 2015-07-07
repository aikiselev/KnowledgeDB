
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
object editArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="""),_display_(/*4.14*/routes/*4.20*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*4.63*/("""></script>

<form class="navbar-form" xmlns="http://www.w3.org/1999/html">
    <div class="col-lg-6">
        <div class="input-group">
            <input type="text" class="form-control" id="name">
            <button type="button" class="btn btn-primary" id="updateArticle">
                    Save
            </button>
        </div>
        <div class="input-group">
            <h4>
            <textarea id="text" rows="8" style="width: 490px; height: 160px;" autocomplete="off"></textarea>
            </h4>
        </div>
    </div>
</form>

<script>
    $(document).ready(function() """),format.raw/*23.34*/("""{"""),format.raw/*23.35*/("""
        """),format.raw/*24.9*/("""$("#updateArticle").click(function()"""),format.raw/*24.45*/("""{"""),format.raw/*24.46*/("""
            """),format.raw/*25.13*/("""var data = """),format.raw/*25.24*/("""{"""),format.raw/*25.25*/("""
                """),format.raw/*26.17*/("""uuid: '"""),_display_(/*26.25*/article/*26.32*/.id),format.raw/*26.35*/("""',
                name: $("#name").val(),
                text: $("#text").val(),
                sectionID: """"),_display_(/*29.30*/article/*29.37*/.sectionID),format.raw/*29.47*/(""""
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""";
            $.ajax("""),format.raw/*31.20*/("""{"""),format.raw/*31.21*/("""
                """),format.raw/*32.17*/("""type: "POST",
                url: """"),_display_(/*33.24*/controllers/*33.35*/.routes.Application.updateArticle()),format.raw/*33.70*/("""",
                data: JSON.stringify(data),
                success: window.location = "/getArticle?"""),_display_(/*35.58*/article/*35.65*/.id),format.raw/*35.68*/("""",
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");
        $("#name").val(""""),_display_(/*40.26*/article/*40.33*/.longName),format.raw/*40.42*/("""");
        $("#text").val('"""),_display_(/*41.26*/article/*41.33*/.text),format.raw/*41.38*/("""');
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""");
</script>"""))}
  }

  def render(article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(article)

  def f:((model.Article) => play.twirl.api.HtmlFormat.Appendable) = (article) => apply(article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/editArticle.scala.html
                  HASH: 9444920b8d13ce7ed2b9b4014c0e13a7001827c1
                  MATRIX: 518->1|630->25|658->27|787->130|801->136|864->179|1486->773|1515->774|1551->783|1615->819|1644->820|1685->833|1724->844|1753->845|1798->862|1833->870|1849->877|1873->880|2012->992|2028->999|2059->1009|2101->1023|2130->1024|2179->1045|2208->1046|2253->1063|2317->1100|2337->1111|2393->1146|2524->1250|2540->1257|2564->1260|2701->1369|2730->1370|2768->1381|2797->1382|2852->1410|2868->1417|2898->1426|2954->1455|2970->1462|2996->1467|3031->1475|3059->1476
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|47->26|50->29|50->29|50->29|51->30|51->30|52->31|52->31|53->32|54->33|54->33|54->33|56->35|56->35|56->35|59->38|59->38|60->39|60->39|61->40|61->40|61->40|62->41|62->41|62->41|63->42|63->42
                  -- GENERATED --
              */
          