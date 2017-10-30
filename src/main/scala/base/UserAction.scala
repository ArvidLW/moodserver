package base

import com.mongodb.casbah.Imports.MongoDBObject
import com.mongodb.casbah.commons.Imports.DBObject
import db.{MgDB, Tables}

object UserAction {
  val conf = Config()
  val db: MgDB = MgDB(conf.getProperty("host"), conf.getProperty("port"), conf.getProperty("db"))

  def registe(user: String, passwd: String): Unit = {
    val mObj:DBObject= MongoDBObject(UserInfo.name -> user, UserInfo.passwd -> passwd)
    db.insert(Tables.users,mObj)
  }

  def Login(): Unit = {

  }

  def getMood(): Unit = {

  }

  def getMoodPlan(): Unit = {

  }

}
