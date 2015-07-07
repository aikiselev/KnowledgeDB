
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
object rootSectionMenuSearch extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<form class="navbar-form navbar-left" role="search">
  <div class="col-lg-6">
    <div class="input-group">
      <input type="text" class="form-control" id="search" placeholder="Search...">
      <span class="input-group-btn">
        <button type="button" class="btn btn-primary" id="submitSearch" onclick="window.location = '/search?' + $('#search').val()">
          Go!
        </button>
      </span>
    </div>
  </div>
</form>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 16:10:45 YEKT 2015
                  SOURCE: /home/kiselev/Downloads/KnowledgeDB/app/views/searchInputl
                  HASH: 3fc894678fadf2038ec8b20c041d7fd267344450
                  MATRIX: 596->0
                  LINES: 22->1
                  -- GENERATED --
              */
          