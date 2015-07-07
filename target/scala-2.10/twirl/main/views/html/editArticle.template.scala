
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
object editArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Section],model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parents: Seq[model.Section], article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Article editor")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<div class="container">
    """),_display_(/*5.6*/articleViewBreadcrumb(parents, article)),format.raw/*5.45*/("""
    """),format.raw/*6.5*/("""</div>

    <div class="container">
        <div class="jumbotron">
            <form class="navbar-form" xmlns="http://www.w3.org/1999/html">
                <div class="input-group-vertical">
                    <input type="text" class="form-control" id="name">
                    <button type="button" class="btn btn-primary" id="updateArticle">
                            Save
                    </button>
                </div>
                <div class="input-group-vertical">
                    <h4>
                    <textarea type="text" class="form-control" id="text" rows="8" style="width: 490px; height: 160px;" autocomplete="off"></textarea>
                    </h4>
                </div>
            </form>
        </div>
    </div>


<script>
    $("#name").val(""""),_display_(/*28.22*/article/*28.29*/.longName.lines),format.raw/*28.44*/("""");
    """),format.raw/*29.96*/("""
    """),format.raw/*30.5*/("""$("#text").html("""),_display_(/*30.22*/for(line <- article.text.lines) yield /*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
     """),format.raw/*31.6*/("""""""),_display_(/*31.8*/line),format.raw/*31.12*/("""" + "\n" +
    """)))}),format.raw/*32.6*/(""""");
    $(document).ready(function() """),format.raw/*33.34*/("""{"""),format.raw/*33.35*/("""
        """),format.raw/*34.9*/("""$("#updateArticle").click(function()"""),format.raw/*34.45*/("""{"""),format.raw/*34.46*/("""
            """),format.raw/*35.13*/("""var data = """),format.raw/*35.24*/("""{"""),format.raw/*35.25*/("""
                """),format.raw/*36.17*/("""uuid: '"""),_display_(/*36.25*/article/*36.32*/.id),format.raw/*36.35*/("""',
                name: $("#name").val(),
                text: $("#text").val(),
                sectionID: """"),_display_(/*39.30*/article/*39.37*/.sectionID),format.raw/*39.47*/(""""
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""";
            $.ajax("""),format.raw/*41.20*/("""{"""),format.raw/*41.21*/("""
                """),format.raw/*42.17*/("""type: "POST",
                url: """"),_display_(/*43.24*/controllers/*43.35*/.routes.Application.updateArticle()),format.raw/*43.70*/("""",
                data: JSON.stringify(data),
                success: setTimeout(function()"""),format.raw/*45.47*/("""{"""),format.raw/*45.48*/("""
                    """),format.raw/*46.21*/("""window.location = "/getArticle?"""),_display_(/*46.53*/article/*46.60*/.id),format.raw/*46.63*/("""";
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/(""", 300),
                dataType : 'application/json',
                contentType : 'application/json'
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/(""");
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""");
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""");
</script>
""")))}))}
  }

  def render(parents:Seq[model.Section],article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(parents,article)

  def f:((Seq[model.Section],model.Article) => play.twirl.api.HtmlFormat.Appendable) = (parents,article) => apply(parents,article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 15:17:30 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/editArticle.scala.html
                  HASH: 64db1951a62c8a718649bb1e89705b17afa4c86f
                  MATRIX: 537->1|678->54|706->57|736->79|775->81|806->86|860->115|919->154|950->159|1767->949|1783->956|1819->971|1855->1070|1887->1075|1931->1092|1978->1123|2018->1125|2051->1131|2079->1133|2104->1137|2150->1153|2216->1191|2245->1192|2281->1201|2345->1237|2374->1238|2415->1251|2454->1262|2483->1263|2528->1280|2563->1288|2579->1295|2603->1298|2742->1410|2758->1417|2789->1427|2831->1441|2860->1442|2909->1463|2938->1464|2983->1481|3047->1518|3067->1529|3123->1564|3244->1657|3273->1658|3322->1679|3381->1711|3397->1718|3421->1721|3468->1740|3497->1741|3641->1857|3670->1858|3708->1869|3737->1870|3771->1877|3799->1878
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|49->28|49->28|49->28|50->29|51->30|51->30|51->30|51->30|52->31|52->31|52->31|53->32|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|57->36|60->39|60->39|60->39|61->40|61->40|62->41|62->41|63->42|64->43|64->43|64->43|66->45|66->45|67->46|67->46|67->46|67->46|68->47|68->47|71->50|71->50|72->51|72->51|73->52|73->52
                  -- GENERATED --
              */
          