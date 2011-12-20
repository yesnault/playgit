import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "playgit"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
		"org.eclipse.jgit" % "org.eclipse.jgit" % "1.1.0.201109151100-r"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here     
		resolvers += "jgit-repository" at "http://download.eclipse.org/jgit/maven"
    )

}
