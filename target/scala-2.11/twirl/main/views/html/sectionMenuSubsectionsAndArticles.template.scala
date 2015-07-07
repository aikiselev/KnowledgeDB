
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
object sectionMenuSubsectionsAndArticles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Section],Seq[model.Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subsections: Seq[model.Section], articles: Seq[model.Article]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*3.1*/("""<div class="list-group" id="sections-list">
    """),_display_(/*4.6*/subsections/*4.17*/.map/*4.21*/ { s =>_display_(Seq[Any](format.raw/*4.28*/("""
        """),format.raw/*5.9*/("""<div class="input-group">
            <button type="button" class="list-group-item" id="#section:"""),_display_(/*6.73*/s/*6.74*/.id),format.raw/*6.77*/(""""
                onclick="window.location = '/getSection?"""),_display_(/*7.58*/s/*7.59*/.id),format.raw/*7.62*/("""'">"""),_display_(/*7.66*/s/*7.67*/.itemNumber),format.raw/*7.78*/(""". """),_display_(/*7.81*/s/*7.82*/.longName),format.raw/*7.91*/("""</button>
            <span class="input-group-btn"">
                <button type="button" class="btn list-group-item" onclick="removeSection('"""),_display_(/*9.92*/s/*9.93*/.id),format.raw/*9.96*/("""')">
                    X
                </button>
            </span>
        </div>
    """)))}),format.raw/*14.6*/("""
    """),_display_(/*15.6*/articles/*15.14*/.zipWithIndex.map/*15.31*/ { case (a, i) =>_display_(Seq[Any](format.raw/*15.48*/("""
        """),format.raw/*16.9*/("""<button type="button" class="list-group-item" id="#article:"""),_display_(/*16.69*/a/*16.70*/.id),format.raw/*16.73*/(""""
            onclick="window.location = '/getArticle?"""),_display_(/*17.54*/a/*17.55*/.id),format.raw/*17.58*/("""'">"""),_display_(/*17.62*/a/*17.63*/.itemNumber),format.raw/*17.74*/(""".  """),_display_(/*17.78*/a/*17.79*/.longName),format.raw/*17.88*/("""<span class="badge">Article</span></button>
    """)))}),format.raw/*18.6*/("""
"""),format.raw/*19.1*/("""</div>


<script>
    function removeSection(sectionID) """),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""
        """),format.raw/*24.9*/("""var data = """),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
            """),format.raw/*25.13*/("""uuid: sectionID
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""";
        $.ajax("""),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
            """),format.raw/*28.13*/("""type: "POST",
            url: """"),_display_(/*29.20*/controllers/*29.31*/.routes.Application.removeSection()),format.raw/*29.66*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""");
        setTimeout(function() """),format.raw/*34.31*/("""{"""),format.raw/*34.32*/(""" """),format.raw/*34.33*/("""location.reload(true) """),format.raw/*34.55*/("""}"""),format.raw/*34.56*/(""",50);
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""</script>"""))}
  }

  def render(subsections:Seq[model.Section],articles:Seq[model.Article]): play.twirl.api.HtmlFormat.Appendable = apply(subsections,articles)

  def f:((Seq[model.Section],Seq[model.Article]) => play.twirl.api.HtmlFormat.Appendable) = (subsections,articles) => apply(subsections,articles)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuSubsectionsAndArticles.scala.html
                  HASH: cf96e86a4acbd4e05f55f8c80e054a9d5e3f6361
                  MATRIX: 564->1|715->64|743->66|817->115|836->126|848->130|892->137|927->146|1051->244|1060->245|1083->248|1168->307|1177->308|1200->311|1230->315|1239->316|1270->327|1299->330|1308->331|1337->340|1508->485|1517->486|1540->489|1663->582|1695->588|1712->596|1738->613|1793->630|1829->639|1916->699|1926->700|1950->703|2032->758|2042->759|2066->762|2097->766|2107->767|2139->778|2170->782|2180->783|2210->792|2289->841|2317->842|2401->898|2430->899|2466->908|2505->919|2534->920|2575->933|2626->957|2655->958|2700->975|2729->976|2770->989|2830->1022|2850->1033|2906->1068|3087->1221|3116->1222|3177->1255|3206->1256|3235->1257|3285->1279|3314->1280|3351->1290|3379->1291|3412->1297
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|25->4|26->5|27->6|27->6|27->6|28->7|28->7|28->7|28->7|28->7|28->7|28->7|28->7|28->7|30->9|30->9|30->9|35->14|36->15|36->15|36->15|36->15|37->16|37->16|37->16|37->16|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|39->18|40->19|44->23|44->23|45->24|45->24|45->24|46->25|47->26|47->26|48->27|48->27|49->28|50->29|50->29|50->29|54->33|54->33|55->34|55->34|55->34|55->34|55->34|56->35|56->35|58->37
                  -- GENERATED --
              */
          