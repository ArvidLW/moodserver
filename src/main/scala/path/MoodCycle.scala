package path

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.model.Uri.Path
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

trait MoodCycle {
  val regAndLog:Route=pathPrefix(ApiMembers.version){

    get{
        path(ApiMembers.users/ IntNumber){ user_id=>
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http"+user_id+"</h1>"))
        }
    } ~ post{
      path(ApiMembers.users){
        complete("ss")
      }
    }
  }
}

