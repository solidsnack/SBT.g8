import sbt._
import Keys._

import org.scalastyle.sbt.ScalastylePlugin

import com.typesafe.sbt.SbtScalariform._
import scalariform.formatter.preferences._

object $name;format="Camel"$Build extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = commonSettings
  ) aggregate(
    baseModels,
    geometry,
    util,
    translatorsBatik,
    translatorsJTS,
    translatorsTeigha,
    translatorsTransform
  )

  lazy val core = Project(
    id = "core",
    base = file("core"),
    settings = commonSettings
  ) dependsOn(
    util
  )

  lazy val util = Project(
    id = "util",
    base = file("util"),
    settings = commonSettings
  )

  lazy val commonSettings = Project.defaultSettings ++
                            ScctPlugin.instrumentSettings ++
                            ScalastylePlugin.Settings ++
                            defaultScalariformSettings ++
                            customFormatSettings

  def customFormatSettings = Seq(
    ScalariformKeys.preferences := FormattingPreferences()
      .setPreference(IndentWithTabs, false)
      .setPreference(IndentSpaces, 2)
      .setPreference(DoubleIndentClassDeclaration, true)
      .setPreference(MultilineScaladocCommentsStartOnFirstLine, false)
      .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
      .setPreference(PreserveDanglingCloseParenthesis, true)
      .setPreference(CompactControlReadability, true)
      .setPreference(AlignSingleLineCaseStatements, true)
      .setPreference(PreserveSpaceBeforeArguments, true)
      .setPreference(SpaceBeforeColon, false)
      .setPreference(SpaceInsideBrackets, false)
      .setPreference(SpaceInsideParentheses, false)
      .setPreference(SpacesWithinPatternBinders, true)
      .setPreference(FormatXml, true)
  )

}
