
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
"""),format.raw/*2.1*/("""<div class="input-group" onload="init()">
    <input type="text" class="form-control" id="title" placeholder="New Article Name">
    <span class="input-group-btn">
        <button type="button" class="btn btn-primary" id="submitArticle">
            Add
        </button>
    </span>
</div>
<div class="input-group">
    <textarea id="text" class="form-control" spellcheck="true" rows="16" cols="300" autocomplete="off" type="text" placeholder="New Article Text"></textarea>
</div>

<script>
    $( document ).ready(function() """),format.raw/*15.36*/("""{"""),format.raw/*15.37*/("""
        """),format.raw/*16.9*/("""$("#submitArticle").click(function()"""),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""

            """),format.raw/*18.13*/("""var data = """),format.raw/*18.24*/("""{"""),format.raw/*18.25*/("""
                """),format.raw/*19.17*/("""name: $("#title").val(),
                text: $("#text").val(),
                sectionID: """"),_display_(/*21.30*/parentSection/*21.43*/.id),format.raw/*21.46*/(""""
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/(""";
            $.ajax("""),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
                """),format.raw/*24.17*/("""type: "POST",
                url: """"),_display_(/*25.24*/controllers/*25.35*/.routes.Application.addArticle()),format.raw/*25.67*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""");
            setTimeout(function() """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/(""" """),format.raw/*30.37*/("""location.reload(true) """),format.raw/*30.59*/("""}"""),format.raw/*30.60*/(""",50);
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""");
    var observe;
    if (window.attachEvent) """),format.raw/*34.29*/("""{"""),format.raw/*34.30*/("""
        """),format.raw/*35.9*/("""observe = function (element, event, handler) """),format.raw/*35.54*/("""{"""),format.raw/*35.55*/("""
            """),format.raw/*36.13*/("""element.attachEvent('on'+event, handler);
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""";
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""else """),format.raw/*39.10*/("""{"""),format.raw/*39.11*/("""
        """),format.raw/*40.9*/("""observe = function (element, event, handler) """),format.raw/*40.54*/("""{"""),format.raw/*40.55*/("""
            """),format.raw/*41.13*/("""element.addEventListener(event, handler, false);
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""";
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/("""
    """),format.raw/*44.5*/("""function init () """),format.raw/*44.22*/("""{"""),format.raw/*44.23*/("""
        """),format.raw/*45.9*/("""var text = document.getElementById('text');
        function resize () """),format.raw/*46.28*/("""{"""),format.raw/*46.29*/("""
            """),format.raw/*47.13*/("""text.style.height = 'auto';
            text.style.height = text.scrollHeight+'px';
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""/* 0-timeout to get the already changed text */
        function delayedResize () """),format.raw/*51.35*/("""{"""),format.raw/*51.36*/("""
            """),format.raw/*52.13*/("""window.setTimeout(resize, 1);
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
        """),format.raw/*54.9*/("""observe(text, 'change',  resize);
        observe(text, 'cut',     delayedResize);
        observe(text, 'paste',   delayedResize);
        observe(text, 'drop',    delayedResize);
        observe(text, 'keydown', delayedResize);

        text.focus();
        text.select();
        resize();
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
"""),format.raw/*64.1*/("""</script>"""))}
  }

  def render(parentSection:model.Section): play.twirl.api.HtmlFormat.Appendable = apply(parentSection)

  def f:((model.Section) => play.twirl.api.HtmlFormat.Appendable) = (parentSection) => apply(parentSection)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 13:08:43 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuAddArticle.scala.html
                  HASH: cdcf06c311ea83b90cf680ecd13fdb3a3da555dc
                  MATRIX: 528->1|646->31|673->32|1228->559|1257->560|1293->569|1357->605|1386->606|1428->620|1467->631|1496->632|1541->649|1662->743|1684->756|1708->759|1750->773|1779->774|1828->795|1857->796|1902->813|1966->850|1986->861|2039->893|2220->1046|2249->1047|2314->1084|2343->1085|2372->1086|2422->1108|2451->1109|2492->1123|2521->1124|2555->1131|2583->1132|2659->1180|2688->1181|2724->1190|2797->1235|2826->1236|2867->1249|2944->1299|2973->1300|3006->1306|3034->1307|3066->1312|3099->1317|3128->1318|3164->1327|3237->1372|3266->1373|3307->1386|3391->1443|3420->1444|3453->1450|3481->1451|3513->1456|3558->1473|3587->1474|3623->1483|3722->1554|3751->1555|3792->1568|3911->1660|3940->1661|3976->1670|4086->1752|4115->1753|4156->1766|4221->1804|4250->1805|4286->1814|4611->2112|4639->2113|4667->2114
                  LINES: 19->1|22->1|23->2|36->15|36->15|37->16|37->16|37->16|39->18|39->18|39->18|40->19|42->21|42->21|42->21|43->22|43->22|44->23|44->23|45->24|46->25|46->25|46->25|50->29|50->29|51->30|51->30|51->30|51->30|51->30|52->31|52->31|53->32|53->32|55->34|55->34|56->35|56->35|56->35|57->36|58->37|58->37|59->38|59->38|60->39|60->39|60->39|61->40|61->40|61->40|62->41|63->42|63->42|64->43|64->43|65->44|65->44|65->44|66->45|67->46|67->46|68->47|70->49|70->49|71->50|72->51|72->51|73->52|74->53|74->53|75->54|84->63|84->63|85->64
                  -- GENERATED --
              */
          