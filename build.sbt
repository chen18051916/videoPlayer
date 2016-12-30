name := """videoPlayer"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.36"
)
playEbeanModels in Compile := Seq("models.*")
resolvers += "Aliyun Maven Repository" at "http://maven.aliyun.com/nexus/content/groups/public/"

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)