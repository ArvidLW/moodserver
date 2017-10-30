package path

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import org.slf4j.LoggerFactory

import scala.io.StdIn

object MoodServer extends RegisteAndLogin {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]) {
    implicit val system = ActorSystem("moodservice")
    implicit val materializer = ActorMaterializer()
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.dispatcher

    val route = regAndLog

    val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)

    logger.info(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
