enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js React boilerplate"

scalaVersion := "2.12.2"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.3",
  "com.github.japgolly.scalajs-react" %%% "core" % "1.1.0",
  "com.github.japgolly.scalacss" %%% "core" % "0.5.3",
  "com.github.japgolly.scalacss" %%% "ext-react" % "0.5.3"
)

npmDependencies in Compile ++= Seq(
  "react" -> "15.6.1",
  "react-dom" -> "15.6.1",
  "react-dom-server" -> "15.6.1"
)
