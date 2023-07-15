ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "ft_linear_mlspark"
  )
libraryDependences ++= Seq(
  "org.apache.spark" %% "spark-sql" sparkVersion withSources(),
  "org.apache.spark" %% "spark-mllib" sparkVersion withSources(),
  "org.scalatest" %% "scalatest" % "3.2.2" % "test" withSources()
)


val sparkVersion = "3.0.1"


