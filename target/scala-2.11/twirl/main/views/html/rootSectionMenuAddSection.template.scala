
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

Seq[Any](format.raw/*1.1*/("""<div class="row">
<form class="navbar-form navbar-left" role="search">
    <div class="col-lg-6">
        <div class="input-group">
            <input type="text" class="form-control" id="name" placeholder="New Section">
            <span class="input-group-btn">
                <button type="button" class="btn btn-primary" id="submitSection">
                Add
                </button>
            </span>
        </div>
    </div>
</form>
</div>

<script>
    $( document ).ready(function() """),format.raw/*17.36*/("""{"""),format.raw/*17.37*/("""
        """),format.raw/*18.9*/("""$("#submitSection").click(function()"""),format.raw/*18.45*/("""{"""),format.raw/*18.46*/("""
            
            """),format.raw/*20.13*/("""var data = """),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
                """),format.raw/*21.17*/("""name: $("#name").val()
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/(""";
            $.ajax("""),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
                """),format.raw/*24.17*/("""type: "POST",
                url: """"),_display_(/*25.24*/controllers/*25.35*/.routes.Application.addRootSection()),format.raw/*25.71*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""");
            setTimeout(function() """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/(""" """),format.raw/*30.37*/("""location.reload(true) """),format.raw/*30.59*/("""}"""),format.raw/*30.60*/(""",50);
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""");

</script>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/rootSectionMenuAddSection.scala.html
                  HASH: 020a81e0844de787f1abf0d5f778a1277331fe3b
                  MATRIX: 600->0|1126->498|1155->499|1191->508|1255->544|1284->545|1338->571|1377->582|1406->583|1451->600|1514->635|1543->636|1592->657|1621->658|1666->675|1730->712|1750->723|1807->759|1988->912|2017->913|2082->950|2111->951|2140->952|2190->974|2219->975|2260->989|2289->990|2323->997|2351->998
                  LINES: 22->1|38->17|38->17|39->18|39->18|39->18|41->20|41->20|41->20|42->21|43->22|43->22|44->23|44->23|45->24|46->25|46->25|46->25|50->29|50->29|51->30|51->30|51->30|51->30|51->30|52->31|52->31|53->32|53->32
                  -- GENERATED --
              */
          