
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
object articleViewChangeArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Article,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(article: model.Article):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<div class="btn-group btn-group-justified" role="group" >
    <div class="btn-group" role="group">
        <button type="button" class="btn btn-primary" id="removeSection">
            Remove
        </button>
    </div>
    <div class="btn-group" role="group">
        <button type="button" class="btn btn-primary" id="editArticle" onclick="window.location = '/editArticle?"""),_display_(/*10.114*/article/*10.121*/.id),format.raw/*10.124*/("""'">
            Edit Article
        </button>
    </div>
</div>
<script>
    $( document ).ready(function() """),format.raw/*16.36*/("""{"""),format.raw/*16.37*/("""
        """),format.raw/*17.9*/("""$("#removeSection").click(function()"""),format.raw/*17.45*/("""{"""),format.raw/*17.46*/("""

            """),format.raw/*19.13*/("""var data = """),format.raw/*19.24*/("""{"""),format.raw/*19.25*/("""
                """),format.raw/*20.17*/("""uuid: '"""),_display_(/*20.25*/article/*20.32*/.id),format.raw/*20.35*/("""'
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/(""";
            $.ajax("""),format.raw/*22.20*/("""{"""),format.raw/*22.21*/("""
                """),format.raw/*23.17*/("""type: "POST",
                url: """"),_display_(/*24.24*/controllers/*24.35*/.routes.Application.removeArticle()),format.raw/*24.70*/("""",
                data: JSON.stringify(data),
                success: window.location = '/getSection?"""),_display_(/*26.58*/article/*26.65*/.sectionID),format.raw/*26.75*/("""',
                dataType:'application/json',
                contentType : 'application/json'
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""");
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""");
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""");
</script>"""))}
  }

  def render(article:model.Article): play.twirl.api.HtmlFormat.Appendable = apply(article)

  def f:((model.Article) => play.twirl.api.HtmlFormat.Appendable) = (article) => apply(article)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/articleViewChangeArticle.scala.html
                  HASH: cfb6c29ae4a611bd1b2ce45d77a957273fbe3dc7
                  MATRIX: 531->1|643->25|671->27|1074->402|1091->409|1116->412|1253->521|1282->522|1318->531|1382->567|1411->568|1453->582|1492->593|1521->594|1566->611|1601->619|1617->626|1641->629|1683->643|1712->644|1761->665|1790->666|1835->683|1899->720|1919->731|1975->766|2106->870|2122->877|2153->887|2290->996|2319->997|2357->1008|2386->1009|2420->1016|2448->1017
                  LINES: 19->1|22->1|24->3|31->10|31->10|31->10|37->16|37->16|38->17|38->17|38->17|40->19|40->19|40->19|41->20|41->20|41->20|41->20|42->21|42->21|43->22|43->22|44->23|45->24|45->24|45->24|47->26|47->26|47->26|50->29|50->29|51->30|51->30|52->31|52->31
                  -- GENERATED --
              */
          