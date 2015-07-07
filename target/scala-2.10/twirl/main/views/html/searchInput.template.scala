
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
object searchInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="input-group">
  <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
  <input type="search" class="form-control" id="search" placeholder="Search...">
  <span class="input-group-btn">
    <button type="button" class="btn btn-primary" id="submitSearch" onclick="window.location = '/search?query=' + $('#search').val()">
      Go!
    </button>
  </span>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 12:57:36 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/searchInput.scala.html
                  HASH: b9f156c00b8f92b8b5c8fbb912246f667728d14c
                  MATRIX: 586->0
                  LINES: 22->1
                  -- GENERATED --
              */
          