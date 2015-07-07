
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
object sectionMenuSubsectionsAndArticles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Seq[model.Section],Seq[model.Article],Seq[model.Section],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subsections: Seq[model.Section], articles: Seq[model.Article], parents: Seq[model.Section]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.94*/("""
"""),format.raw/*2.1*/("""<div class="list-group" id="sections-list">
    """),_display_(/*3.6*/subsections/*3.17*/.map/*3.21*/ { s =>_display_(Seq[Any](format.raw/*3.28*/("""
        """),format.raw/*4.9*/("""<div class="input-group">
            <button type="button" class="list-group-item" id="#section:"""),_display_(/*5.73*/s/*5.74*/.id),format.raw/*5.77*/(""""
                onclick="window.location = '/getSection?"""),_display_(/*6.58*/s/*6.59*/.id),format.raw/*6.62*/("""'">
                """),_display_(/*7.18*/if(parents.isEmpty)/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""
                    """),_display_(/*8.22*/s/*8.23*/.itemNumber),format.raw/*8.34*/("""
                """)))}),format.raw/*9.18*/("""
                """),_display_(/*10.18*/if(parents.nonEmpty)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
                    """),_display_(/*11.22*/parents/*11.29*/.map(_.itemNumber).mkString(".")),format.raw/*11.61*/("""."""),_display_(/*11.63*/s/*11.64*/.itemNumber),format.raw/*11.75*/("""
                """)))}),format.raw/*12.18*/(""" """),_display_(/*12.20*/s/*12.21*/.shortName),format.raw/*12.31*/("""</button>
            <span class="input-group-btn" onclick="removeSection('"""),_display_(/*13.68*/s/*13.69*/.id),format.raw/*13.72*/("""')">
                <button type="button" class="btn btn-danger" >
                    X
                </button>
            </span>
        </div>
    """)))}),format.raw/*19.6*/("""
    """),_display_(/*20.6*/articles/*20.14*/.zipWithIndex.map/*20.31*/ { case (a, i) =>_display_(Seq[Any](format.raw/*20.48*/("""
        """),format.raw/*21.9*/("""<button type="button" class="list-group-item list-group-item-info" id="#article:"""),_display_(/*21.90*/a/*21.91*/.id),format.raw/*21.94*/(""""
            onclick="window.location = '/getArticle?"""),_display_(/*22.54*/a/*22.55*/.id),format.raw/*22.58*/("""'">"""),_display_(/*22.62*/a/*22.63*/.itemNumber),format.raw/*22.74*/(""".  """),_display_(/*22.78*/a/*22.79*/.shortName),format.raw/*22.89*/("""<span class="badge">Article</span></button>
    """)))}),format.raw/*23.6*/("""
 """),format.raw/*24.2*/("""</div>

<script>
    function removeSection(sectionID) """),format.raw/*27.39*/("""{"""),format.raw/*27.40*/("""
        """),format.raw/*28.9*/("""var data = """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
            """),format.raw/*29.13*/("""uuid: sectionID
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""";
        $.ajax("""),format.raw/*31.16*/("""{"""),format.raw/*31.17*/("""
            """),format.raw/*32.13*/("""type: "POST",
            url: """"),_display_(/*33.20*/controllers/*33.31*/.routes.Application.removeSection()),format.raw/*33.66*/("""",
                data: JSON.stringify(data),
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/(""");
        setTimeout(function() """),format.raw/*38.31*/("""{"""),format.raw/*38.32*/(""" """),format.raw/*38.33*/("""location.reload(true) """),format.raw/*38.55*/("""}"""),format.raw/*38.56*/(""", 300);
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""
"""),format.raw/*40.1*/("""</script>"""))}
  }

  def render(subsections:Seq[model.Section],articles:Seq[model.Article],parents:Seq[model.Section]): play.twirl.api.HtmlFormat.Appendable = apply(subsections,articles,parents)

  def f:((Seq[model.Section],Seq[model.Article],Seq[model.Section]) => play.twirl.api.HtmlFormat.Appendable) = (subsections,articles,parents) => apply(subsections,articles,parents)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 14:11:30 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuSubsectionsAndArticles.scala.html
                  HASH: b47c600151b614d3f08663a077887cb5f7b67d4a
                  MATRIX: 583->1|763->93|790->94|864->143|883->154|895->158|939->165|974->174|1098->272|1107->273|1130->276|1215->335|1224->336|1247->339|1294->360|1321->379|1360->381|1408->403|1417->404|1448->415|1496->433|1541->451|1570->471|1610->473|1659->495|1675->502|1728->534|1757->536|1767->537|1799->548|1848->566|1877->568|1887->569|1918->579|2022->656|2032->657|2056->660|2242->816|2274->822|2291->830|2317->847|2372->864|2408->873|2516->954|2526->955|2550->958|2632->1013|2642->1014|2666->1017|2697->1021|2707->1022|2739->1033|2770->1037|2780->1038|2811->1048|2890->1097|2919->1099|3002->1154|3031->1155|3067->1164|3106->1175|3135->1176|3176->1189|3227->1213|3256->1214|3301->1231|3330->1232|3371->1245|3431->1278|3451->1289|3507->1324|3688->1477|3717->1478|3778->1511|3807->1512|3836->1513|3886->1535|3915->1536|3954->1548|3982->1549|4010->1550
                  LINES: 19->1|22->1|23->2|24->3|24->3|24->3|24->3|25->4|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|31->10|31->10|31->10|32->11|32->11|32->11|32->11|32->11|32->11|33->12|33->12|33->12|33->12|34->13|34->13|34->13|40->19|41->20|41->20|41->20|41->20|42->21|42->21|42->21|42->21|43->22|43->22|43->22|43->22|43->22|43->22|43->22|43->22|43->22|44->23|45->24|48->27|48->27|49->28|49->28|49->28|50->29|51->30|51->30|52->31|52->31|53->32|54->33|54->33|54->33|58->37|58->37|59->38|59->38|59->38|59->38|59->38|60->39|60->39|61->40
                  -- GENERATED --
              */
          