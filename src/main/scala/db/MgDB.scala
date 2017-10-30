package db

import com.mongodb.BasicDBObject
import com.mongodb.casbah.Imports.{MongoDBObject, _}
import com.mongodb.casbah.commons.Imports.DBObject

class MgDB(val host: String, val port: Int, val dbname: String) {
  val db: MongoDB = MongoClient(host, port)(dbname)

  def insert(table: String, mObj: DBObject): Unit = {
    db(table).insert(mObj)
  }

  def update(): Unit = {

  }

  def delete(): Unit = {

  }

}

object MgDB {
  var mg: MgDB = _
  def apply(host: String, port: String, db: String): MgDB = {
    if (mg == null) {
      mg = new MgDB(host, Integer.parseInt(port), db)
    }
    mg
  }

  //  def main(args: Array[String]): Unit = {
  //
  //    val mongoClient = MongoClient("localhost", 27017)
  //    val db = mongoClient("test")
  //    val col1 = db("runoob")
  //    val a = MongoDBObject("name" -> "lw")
  //    val kk = new BasicDBObject().append("key", 1)
  //    println(kk.getClass)
  //    val keys = MongoDBObject("name" -> 2)
  //    println(keys.getClass)
  //    //    kk.put("sex",1)
  //    val re = col1.find(a, kk)
  //
  //    re.foreach(println)
  //  }
}
