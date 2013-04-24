organization in ThisBuild := "$package$"

name := "$name;format="normalize"$"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.1"

libraryDependencies in ThisBuild ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.9",
  "org.scalatest" %% "scalatest" % "2.0.M5b" % "test"
)

scalacOptions in (ThisBuild, Compile) ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

javacOptions in (ThisBuild, Compile) ++= Seq(
  "-Xlint:unchecked"
)

parallelExecution in (ThisBuild, Test) := false
