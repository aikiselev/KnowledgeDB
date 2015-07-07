
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
object sectionMenuAddArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Section,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parentSection: model.Section):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<form class="navbar-form">
    <div class="col-lg-6">
        <div class="input-group">
            <input type="text" class="form-control" id="title" placeholder="New Article Name">
            <span class="input-group-btn">
                <button type="button" class="btn btn-primary" id="submitArticle">
                    Add
                </button>
            </span>
        </div>
        <div class="input-group">
            <h4>New Article Text</h4>
            <textarea id="text" rows="8" style="width: 490px; height: 160px;" autocomplete="off"></textarea>
        </div>
    </div>
</form>

<script>
    $( document ).ready(function() """),format.raw/*21.36*/("""{"""),format.raw/*21.37*/("""
        """),format.raw/*22.9*/("""$("#submitArticle").click(function()"""),format.raw/*22.45*/("""{"""),format.raw/*22.46*/("""

            """),format.raw/*24.13*/("""var data = """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
                """),format.raw/*25.17*/("""name: $("#title").val(),
                text: $("#text").val(),
                sectionID: """"),_display_(/*27.30*/parentSection/*27.43*/.id),format.raw/*27.46*/(""""
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/(""";
            $.ajax("""),format.raw/*29.20*/("""{"""),format.raw/*29.21*/("""
                """),format.raw/*30.17*/("""type: "POST",
                url: """"),_display_(/*31.24*/controllers/*31.35*/.routes.Application.addArticle()),format.raw/*31.67*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""");
            setTimeout(function() """),format.raw/*36.35*/("""{"""),format.raw/*36.36*/(""" """),format.raw/*36.37*/("""location.reload(true) """),format.raw/*36.59*/("""}"""),format.raw/*36.60*/(""",50);
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""");
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/(""");

</script>"""))}
  }

  def render(parentSection:model.Section): play.twirl.api.HtmlFormat.Appendable = apply(parentSection)

  def f:((model.Section) => play.twirl.api.HtmlFormat.Appendable) = (parentSection) => apply(parentSection)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuAddArticle.scala.html
                  HASH: 7deb8ae146a12f907b0e5f1e02667eb76a765a87
                  MATRIX: 528->1|646->31|674->33|1355->686|1384->687|1420->696|1484->732|1513->733|1555->747|1594->758|1623->759|1668->776|1789->870|1811->883|1835->886|1877->900|1906->901|1955->922|1984->923|2029->940|2093->977|2113->988|2166->1020|2347->1173|2376->1174|2441->1211|2470->1212|2499->1213|2549->1235|2578->1236|2619->1250|2648->1251|2682->1258|2710->1259
                  LINES: 19->1|22->1|24->3|42->21|42->21|43->22|43->22|43->22|45->24|45->24|45->24|46->25|48->27|48->27|48->27|49->28|49->28|50->29|50->29|51->30|52->31|52->31|52->31|56->35|56->35|57->36|57->36|57->36|57->36|57->36|58->37|58->37|59->38|59->38
                  -- GENERATED --
              */
          