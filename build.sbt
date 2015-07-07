name := """play-scala-2.3"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

//scalaVersion := "2.11.6"
scalaVersion := "2.10.4"


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.squeryl" % "squeryl_2.10" % "0.9.5-7",
  "postgresql" % "postgresql" % "8.4-701.jdbc4",
  "com.sksamuel.elastic4s" %% "elastic4s-core" % "1.6.2"
)

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases"

fork in run := false