// @SOURCE:/home/kiselev/Downloads/KnowledgeDB/conf/routes
// @HASH:3e38ae5694c1aa0cc85c643bbaa37cb16cf95ffc
// @DATE:Mon Jul 06 16:10:44 YEKT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_addArticle1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submitArticle"))))
private[this] lazy val controllers_Application_addArticle1_invoker = createInvoker(
controllers.Application.addArticle,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addArticle", Nil,"POST", """""", Routes.prefix + """submitArticle"""))
        

// @LINE:10
private[this] lazy val controllers_Application_addRootSection2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addRootSection"))))
private[this] lazy val controllers_Application_addRootSection2_invoker = createInvoker(
controllers.Application.addRootSection,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRootSection", Nil,"POST", """""", Routes.prefix + """addRootSection"""))
        

// @LINE:12
private[this] lazy val controllers_Application_addSection3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addSection"))))
private[this] lazy val controllers_Application_addSection3_invoker = createInvoker(
controllers.Application.addSection,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addSection", Nil,"POST", """""", Routes.prefix + """addSection"""))
        

// @LINE:14
private[this] lazy val controllers_Application_removeSection4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("removeSection"))))
private[this] lazy val controllers_Application_removeSection4_invoker = createInvoker(
controllers.Application.removeSection,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeSection", Nil,"POST", """""", Routes.prefix + """removeSection"""))
        

// @LINE:16
private[this] lazy val controllers_Application_removeArticle5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("removeArticle"))))
private[this] lazy val controllers_Application_removeArticle5_invoker = createInvoker(
controllers.Application.removeArticle,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeArticle", Nil,"POST", """""", Routes.prefix + """removeArticle"""))
        

// @LINE:18
private[this] lazy val controllers_Application_updateArticle6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateArticle"))))
private[this] lazy val controllers_Application_updateArticle6_invoker = createInvoker(
controllers.Application.updateArticle,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateArticle", Nil,"POST", """""", Routes.prefix + """updateArticle"""))
        

// @LINE:20
private[this] lazy val controllers_Application_sectionMenu7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSection"))))
private[this] lazy val controllers_Application_sectionMenu7_invoker = createInvoker(
controllers.Application.sectionMenu,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sectionMenu", Nil,"GET", """""", Routes.prefix + """getSection"""))
        

// @LINE:22
private[this] lazy val controllers_Application_articleView8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getArticle"))))
private[this] lazy val controllers_Application_articleView8_invoker = createInvoker(
controllers.Application.articleView,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "articleView", Nil,"GET", """""", Routes.prefix + """getArticle"""))
        

// @LINE:24
private[this] lazy val controllers_Application_editArticle9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editArticle"))))
private[this] lazy val controllers_Application_editArticle9_invoker = createInvoker(
controllers.Application.editArticle,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editArticle", Nil,"GET", """""", Routes.prefix + """editArticle"""))
        

// @LINE:26
private[this] lazy val controllers_Application_search10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_search10_invoker = createInvoker(
controllers.Application.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"GET", """""", Routes.prefix + """search"""))
        

// @LINE:29
private[this] lazy val controllers_Assets_at11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submitArticle""","""controllers.Application.addArticle"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addRootSection""","""controllers.Application.addRootSection"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addSection""","""controllers.Application.addSection"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removeSection""","""controllers.Application.removeSection"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removeArticle""","""controllers.Application.removeArticle"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateArticle""","""controllers.Application.updateArticle"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSection""","""controllers.Application.sectionMenu"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getArticle""","""controllers.Application.articleView"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editArticle""","""controllers.Application.editArticle"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:8
case controllers_Application_addArticle1_route(params) => {
   call { 
        controllers_Application_addArticle1_invoker.call(controllers.Application.addArticle)
   }
}
        

// @LINE:10
case controllers_Application_addRootSection2_route(params) => {
   call { 
        controllers_Application_addRootSection2_invoker.call(controllers.Application.addRootSection)
   }
}
        

// @LINE:12
case controllers_Application_addSection3_route(params) => {
   call { 
        controllers_Application_addSection3_invoker.call(controllers.Application.addSection)
   }
}
        

// @LINE:14
case controllers_Application_removeSection4_route(params) => {
   call { 
        controllers_Application_removeSection4_invoker.call(controllers.Application.removeSection)
   }
}
        

// @LINE:16
case controllers_Application_removeArticle5_route(params) => {
   call { 
        controllers_Application_removeArticle5_invoker.call(controllers.Application.removeArticle)
   }
}
        

// @LINE:18
case controllers_Application_updateArticle6_route(params) => {
   call { 
        controllers_Application_updateArticle6_invoker.call(controllers.Application.updateArticle)
   }
}
        

// @LINE:20
case controllers_Application_sectionMenu7_route(params) => {
   call { 
        controllers_Application_sectionMenu7_invoker.call(controllers.Application.sectionMenu)
   }
}
        

// @LINE:22
case controllers_Application_articleView8_route(params) => {
   call { 
        controllers_Application_articleView8_invoker.call(controllers.Application.articleView)
   }
}
        

// @LINE:24
case controllers_Application_editArticle9_route(params) => {
   call { 
        controllers_Application_editArticle9_invoker.call(controllers.Application.editArticle)
   }
}
        

// @LINE:26
case controllers_Application_search10_route(params) => {
   call { 
        controllers_Application_search10_invoker.call(controllers.Application.search)
   }
}
        

// @LINE:29
case controllers_Assets_at11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     