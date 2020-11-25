
name := "scala-data-analysis-cookbok"

organization := "com.sebas"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "1.1",
  "org.scalanlp" %% "breeze-natives" % "1.1",
  "org.scalatest" %% "scalatest" % "3.2.2" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.2" % "test"
)
    //,
//Optional - the 'why' is explained in the How it works section
// "org.scalanlp" %% "breeze-natives" % "0.11.2")