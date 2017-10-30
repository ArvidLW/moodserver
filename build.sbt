name := "moodserver"

version := "1.0"

scalaVersion := "2.11.7"

// Akka-Http
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.10"
libraryDependencies += "org.mongodb" % "casbah-core_2.11" % "3.1.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.2"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25"
libraryDependencies += "log4j" % "log4j" % "1.2.17"
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.25"
        