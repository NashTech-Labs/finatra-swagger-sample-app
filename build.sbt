name := "finatra-swagger-sample"

version := "1.0"

scalaVersion := "2.12.0"

lazy val versions = new {
  val finatra = "2.2.0"
  val swagger = "0.7.2"
}

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "com.twitter" %% "finatra-http" % "2.10.0" % "compile"
libraryDependencies += "com.jakehschwartz" % "finatra-swagger_2.12" % "2.9.0" % "compile"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
