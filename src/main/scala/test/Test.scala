package test

import scala.runtime.RichInt

object Test {
  def main(args: Array[String]): Unit = {
    var t =new T1(10)
    t = t - 5
    println()
  }
}
class T1(x:Int){
  def -(n:Int): T1 ={
    println(n)
    new T1(5)
  }
}
