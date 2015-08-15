name := "PlayTestProject"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

libraryDependencies += "com.google.api-client" % "google-api-client" % "1.20.0"
