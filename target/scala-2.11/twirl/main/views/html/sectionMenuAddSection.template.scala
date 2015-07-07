
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
object sectionMenuAddSection extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Section,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parentSection: model.Section):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<form class="navbar-form">
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

<script>
    $( document ).ready(function() """),format.raw/*17.36*/("""{"""),format.raw/*17.37*/("""
        """),format.raw/*18.9*/("""$("#submitSection").click(function()"""),format.raw/*18.45*/("""{"""),format.raw/*18.46*/("""

            """),format.raw/*20.13*/("""var data = """),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
                """),format.raw/*21.17*/("""name: $("#name").val(),
                parentID: """"),_display_(/*22.29*/parentSection/*22.42*/.id),format.raw/*22.45*/(""""
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/(""";
            $.ajax("""),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
                """),format.raw/*25.17*/("""type: "POST",
                url: """"),_display_(/*26.24*/controllers/*26.35*/.routes.Application.addSection()),format.raw/*26.67*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""");
            setTimeout(function() """),format.raw/*31.35*/("""{"""),format.raw/*31.36*/(""" """),format.raw/*31.37*/("""location.reload(true) """),format.raw/*31.59*/("""}"""),format.raw/*31.60*/(""",50);
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/(""");
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""");

</script>"""))}
  }

  def render(parentSection:model.Section): play.twirl.api.HtmlFormat.Appendable = apply(parentSection)

  def f:((model.Section) => play.twirl.api.HtmlFormat.Appendable) = (parentSection) => apply(parentSection)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuAddSection.scala.html
                  HASH: cd8d3b69152ead613a2a60c7800e92707496d249
                  MATRIX: 528->1|646->31|674->33|1139->470|1168->471|1204->480|1268->516|1297->517|1339->531|1378->542|1407->543|1452->560|1531->612|1553->625|1577->628|1619->642|1648->643|1697->664|1726->665|1771->682|1835->719|1855->730|1908->762|2089->915|2118->916|2183->953|2212->954|2241->955|2291->977|2320->978|2361->992|2390->993|2424->1000|2452->1001
                  LINES: 19->1|22->1|24->3|38->17|38->17|39->18|39->18|39->18|41->20|41->20|41->20|42->21|43->22|43->22|43->22|44->23|44->23|45->24|45->24|46->25|47->26|47->26|47->26|51->30|51->30|52->31|52->31|52->31|52->31|52->31|53->32|53->32|54->33|54->33
                  -- GENERATED --
              */
          