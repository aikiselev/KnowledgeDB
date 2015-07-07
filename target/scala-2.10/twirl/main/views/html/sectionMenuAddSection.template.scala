
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
"""),format.raw/*2.1*/("""<div class="input-group">
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

            """),format.raw/*16.13*/("""var data = """),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""
                """),format.raw/*17.17*/("""name: $("#name").val(),
                parentID: """"),_display_(/*18.29*/parentSection/*18.42*/.id),format.raw/*18.45*/(""""
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/(""";
            $.ajax("""),format.raw/*20.20*/("""{"""),format.raw/*20.21*/("""
                """),format.raw/*21.17*/("""type: "POST",
                url: """"),_display_(/*22.24*/controllers/*22.35*/.routes.Application.addSection()),format.raw/*22.67*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/(""");
            setTimeout(function() """),format.raw/*27.35*/("""{"""),format.raw/*27.36*/(""" """),format.raw/*27.37*/("""location.reload(true) """),format.raw/*27.59*/("""}"""),format.raw/*27.60*/(""",300);
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""");

</script>"""))}
  }

  def render(parentSection:model.Section): play.twirl.api.HtmlFormat.Appendable = apply(parentSection)

  def f:((model.Section) => play.twirl.api.HtmlFormat.Appendable) = (parentSection) => apply(parentSection)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 14:55:44 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuAddSection.scala.html
                  HASH: 9d4eb6114f62036e9215c5c262477e304d34d799
                  MATRIX: 528->1|646->31|673->32|1105->436|1134->437|1170->446|1234->482|1263->483|1305->497|1344->508|1373->509|1418->526|1497->578|1519->591|1543->594|1585->608|1614->609|1663->630|1692->631|1737->648|1801->685|1821->696|1874->728|2055->881|2084->882|2149->919|2178->920|2207->921|2257->943|2286->944|2328->959|2357->960|2391->967|2419->968
                  LINES: 19->1|22->1|23->2|34->13|34->13|35->14|35->14|35->14|37->16|37->16|37->16|38->17|39->18|39->18|39->18|40->19|40->19|41->20|41->20|42->21|43->22|43->22|43->22|47->26|47->26|48->27|48->27|48->27|48->27|48->27|49->28|49->28|50->29|50->29
                  -- GENERATED --
              */
          