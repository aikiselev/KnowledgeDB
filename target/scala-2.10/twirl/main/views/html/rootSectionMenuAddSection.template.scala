
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
object rootSectionMenuAddSection extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<div class="input-group">
    <span class="input-group-addon"><span class="glyphicon glyphicon-plus"></span></span>
    <input type="text" class="form-control" id="name" placeholder="New Section">
    <span class="input-group-btn">
        <button type="button" class="btn btn-primary" id="submitSection">
        Add
        </button>
    </span>
</div>

<script>
    $( document ).ready(function() """),format.raw/*13.36*/("""{"""),format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""$("#submitSection").click(function()"""),format.raw/*14.45*/("""{"""),format.raw/*14.46*/("""
            """),format.raw/*15.13*/("""var data = """),format.raw/*15.24*/("""{"""),format.raw/*15.25*/("""
                """),format.raw/*16.17*/("""name: $("#name").val()
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""";
            $.ajax("""),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
                """),format.raw/*19.17*/("""type: "POST",
                url: """"),_display_(/*20.24*/controllers/*20.35*/.routes.Application.addRootSection()),format.raw/*20.71*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""");
            setTimeout(function() """),format.raw/*25.35*/("""{"""),format.raw/*25.36*/(""" """),format.raw/*25.37*/("""location.reload() """),format.raw/*25.55*/("""}"""),format.raw/*25.56*/(""", 100);
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""");
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""");

</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 13:48:24 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/rootSectionMenuAddSection.scala.html
                  HASH: 4b18631933e2d81b75351d5d033875240aeb3126
                  MATRIX: 600->1|1028->401|1057->402|1093->411|1157->447|1186->448|1227->461|1266->472|1295->473|1340->490|1403->525|1432->526|1481->547|1510->548|1555->565|1619->602|1639->613|1696->649|1877->802|1906->803|1971->840|2000->841|2029->842|2075->860|2104->861|2147->877|2176->878|2210->885|2238->886
                  LINES: 22->2|33->13|33->13|34->14|34->14|34->14|35->15|35->15|35->15|36->16|37->17|37->17|38->18|38->18|39->19|40->20|40->20|40->20|44->24|44->24|45->25|45->25|45->25|45->25|45->25|46->26|46->26|47->27|47->27
                  -- GENERATED --
              */
          