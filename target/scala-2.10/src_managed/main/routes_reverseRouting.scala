// @SOURCE:/home/kiselev/Downloads/KnowledgeDB/conf/routes
// @HASH:d5d8054d3cd333359f91326d4108401a51fdc77b
// @DATE:Tue Jul 07 13:42:35 YEKT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:32
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers {

// @LINE:32
class ReverseAssets {


// @LINE:32
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:22
def articleView(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getArticle")
}
                        

// @LINE:14
def removeSection(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "removeSection")
}
                        

// @LINE:18
def updateArticle(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateArticle")
}
                        

// @LINE:16
def removeArticle(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "removeArticle")
}
                        

// @LINE:8
def addArticle(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "submitArticle")
}
                        

// @LINE:28
def exportToXML(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "exportToXML")
}
                        

// @LINE:26
def search(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:24
def editArticle(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editArticle")
}
                        

// @LINE:10
def addRootSection(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addRootSection")
}
                        

// @LINE:12
def addSection(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addSection")
}
                        

// @LINE:20
def sectionMenu(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getSection")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:32
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:32
class ReverseAssets {


// @LINE:32
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:22
def articleView : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.articleView",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getArticle"})
      }
   """
)
                        

// @LINE:14
def removeSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeSection",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeSection"})
      }
   """
)
                        

// @LINE:18
def updateArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateArticle",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateArticle"})
      }
   """
)
                        

// @LINE:16
def removeArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeArticle",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removeArticle"})
      }
   """
)
                        

// @LINE:8
def addArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addArticle",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitArticle"})
      }
   """
)
                        

// @LINE:28
def exportToXML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.exportToXML",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportToXML"})
      }
   """
)
                        

// @LINE:26
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:24
def editArticle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editArticle",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editArticle"})
      }
   """
)
                        

// @LINE:10
def addRootSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRootSection",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addRootSection"})
      }
   """
)
                        

// @LINE:12
def addSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addSection",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addSection"})
      }
   """
)
                        

// @LINE:20
def sectionMenu : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sectionMenu",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getSection"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:32
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:32
class ReverseAssets {


// @LINE:32
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:22
def articleView(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.articleView(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "articleView", Seq(), "GET", """""", _prefix + """getArticle""")
)
                      

// @LINE:14
def removeSection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeSection(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeSection", Seq(), "POST", """""", _prefix + """removeSection""")
)
                      

// @LINE:18
def updateArticle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateArticle(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateArticle", Seq(), "POST", """""", _prefix + """updateArticle""")
)
                      

// @LINE:16
def removeArticle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeArticle(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeArticle", Seq(), "POST", """""", _prefix + """removeArticle""")
)
                      

// @LINE:8
def addArticle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addArticle(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addArticle", Seq(), "POST", """""", _prefix + """submitArticle""")
)
                      

// @LINE:28
def exportToXML(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.exportToXML(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "exportToXML", Seq(), "GET", """""", _prefix + """exportToXML""")
)
                      

// @LINE:26
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      

// @LINE:24
def editArticle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editArticle(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editArticle", Seq(), "GET", """""", _prefix + """editArticle""")
)
                      

// @LINE:10
def addRootSection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRootSection(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRootSection", Seq(), "POST", """""", _prefix + """addRootSection""")
)
                      

// @LINE:12
def addSection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addSection(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addSection", Seq(), "POST", """""", _prefix + """addSection""")
)
                      

// @LINE:20
def sectionMenu(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sectionMenu(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sectionMenu", Seq(), "GET", """""", _prefix + """getSection""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    