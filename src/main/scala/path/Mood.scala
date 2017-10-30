package path

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.model.Uri.Path
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

trait Mood {
  val regAndLog:Route=pathPrefix(ApiMembers.version){
    get{
      path(ApiMembers.users / Segment / ApiMembers.passwds / Segment){ (user,passwds)=>
        complete(user+":"+passwds)
      }
    } ~ post{
      path(ApiMembers.users){
        complete("ss")
      }
    }
  }
}

