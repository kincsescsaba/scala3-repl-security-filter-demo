ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala3-repl-security-filter-demo",
    idePackagePrefix := Some("io.github.kincsescsaba.scala3replfilter")
  )
