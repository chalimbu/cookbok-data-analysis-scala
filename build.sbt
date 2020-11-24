
name := "scala-data-analysis-cookbok"

organization := "com.sebas"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies  ++=
  Seq(  "org.scalanlp" %% "breeze" % "0.11.2")
    //,
//Optional - the 'why' is explained in the How it works section
// "org.scalanlp" %% "breeze-natives" % "0.11.2")