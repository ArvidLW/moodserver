package db

import java.sql.{DriverManager, ResultSet}

object PgDB {
  def main(args: Array[String]): Unit = {
    classOf[com.mysql.jdbc.Driver]
    val conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mood?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","111")
    val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
    var re=statement.execute("insert into mood.mood values(null,'15882082269','刘炜','90','sss','http://www.baidu.com/icon.jpg',now(),'1');")
    //var re=statement.executeQuery("select * from mood")
//    while(re.next()){
//      println("哈哈")
//    }
  }

}
