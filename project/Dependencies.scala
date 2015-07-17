import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._


object Dependencies {

	//libs for testing
	lazy val testing = Def.setting(Seq(
		"org.scalatest" %%% "scalatest" % Versions.scalaTest % "test"
	))

	
	//akka-related libs
	lazy val akka = Def.setting(Seq(

		"com.typesafe.akka" %% "akka-stream-experimental" % Versions.akkaHttp,

		"com.typesafe.akka" %% "akka-http-core-experimental" % Versions.akkaHttp,

		"com.typesafe.akka" %% "akka-http-experimental" % Versions.akkaHttp,

		"com.typesafe.akka" %% "akka-http-testkit-experimental" % Versions.akkaHttp

	))

	//akka-related libs
	lazy val otherJVM = Def.setting(Seq(
		"com.github.t3hnar" %% "scala-bcrypt" % Versions.bcrypt,

		"commons-codec" % "commons-codec" % Versions.apacheCodec
	))


	//scalajs libs
	lazy val sjsLibs= Def.setting(Seq(
		"org.scala-js" %%% "scalajs-dom" % Versions.dom,

		"org.querki" %%% "jquery-facade" % Versions.jqueryFacade, //scalajs facade for jQuery + jQuery extensions

		"org.denigma" %%% "codemirror-facade" % Versions.codemirrorFacade,

		"org.denigma" %%% "semantic-ui-facade" % Versions.semanticUIFacade,

		"org.denigma" %%% "binding" % Versions.binding
	))

	//dependencies on javascript libs
	lazy val webjars= Def.setting(Seq(

		"org.webjars" % "Semantic-UI" % Versions.semanticUI, //css theme, similar to bootstrap

		"org.webjars" % "selectize.js" % Versions.selectize, //select control

		"org.webjars" % "codemirror" % Versions.codemirror
	))

	//common purpose libs
	lazy val shared: Def.Initialize[Seq[ModuleID]] = Def.setting(Seq(
		"com.github.japgolly.scalacss" %%% "core" % Versions.scalaCSS,

		"com.github.japgolly.scalacss" %%% "ext-scalatags" %  Versions.scalaCSS
	))
}
