
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
object sectionMenuBreadcrumb extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[model.Section],model.Section,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parents: Seq[model.Section], currentSection: model.Section):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
   <li><a href="/">Home</a></li>
   """),_display_(/*5.5*/for((p,i) <- parents.zipWithIndex) yield /*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
       """),format.raw/*6.8*/("""<li><a href="#" onclick="window.location = '/getSection?"""),_display_(/*6.65*/p/*6.66*/.id),format.raw/*6.69*/("""'">"""),_display_(/*6.73*/parents/*6.80*/.map(_.itemNumber).take(i+1).mkString(".")),format.raw/*6.122*/(""" """),_display_(/*6.124*/p/*6.125*/.longName),format.raw/*6.134*/("""</a></li>
   """)))}),format.raw/*7.5*/("""
    """),_display_(/*8.6*/if(parents.isEmpty)/*8.25*/ {_display_(Seq[Any](format.raw/*8.27*/("""
        """),format.raw/*9.9*/("""<li class="active">"""),_display_(/*9.29*/currentSection/*9.43*/.itemNumber),format.raw/*9.54*/(""" """),_display_(/*9.56*/currentSection/*9.70*/.longName),format.raw/*9.79*/("""</li>
    """)))}),format.raw/*10.6*/("""
    """),_display_(/*11.6*/if(parents.nonEmpty)/*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""
        """),format.raw/*12.9*/("""<li class="active">"""),_display_(/*12.29*/parents/*12.36*/.map(_.itemNumber).mkString(".")),format.raw/*12.68*/("""."""),_display_(/*12.70*/currentSection/*12.84*/.itemNumber),format.raw/*12.95*/(""" """),_display_(/*12.97*/currentSection/*12.111*/.longName),format.raw/*12.120*/("""</li>
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</ol>
"""))}
  }

  def render(parents:Seq[model.Section],currentSection:model.Section): play.twirl.api.HtmlFormat.Appendable = apply(parents,currentSection)

  def f:((Seq[model.Section],model.Section) => play.twirl.api.HtmlFormat.Appendable) = (parents,currentSection) => apply(parents,currentSection)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/sectionMenuBreadcrumb.scala.html
                  HASH: f84ba6dc2b85fc96057cbf0476058f27c83ddfd0
                  MATRIX: 547->1|695->61|723->63|809->124|858->158|897->160|931->168|1014->225|1023->226|1046->229|1076->233|1091->240|1154->282|1183->284|1193->285|1223->294|1266->308|1297->314|1324->333|1363->335|1398->344|1444->364|1466->378|1497->389|1525->391|1547->405|1576->414|1617->425|1649->431|1678->451|1718->453|1754->462|1801->482|1817->489|1870->521|1899->523|1922->537|1954->548|1983->550|2007->564|2038->573|2079->584|2107->585
                  LINES: 19->1|22->1|24->3|26->5|26->5|26->5|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|27->6|28->7|29->8|29->8|29->8|30->9|30->9|30->9|30->9|30->9|30->9|30->9|31->10|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|33->12|33->12|33->12|33->12|33->12|34->13|35->14
                  -- GENERATED --
              */
          