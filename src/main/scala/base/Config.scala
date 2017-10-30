package base

import java.util.Properties


object Config {
  var conf:Properties=_
  def apply(): Properties = {
    if(conf==null){
      conf=new Properties()
      conf.load(getClass.getClassLoader.getResourceAsStream("moodweb.properties"))
    }
    conf
  }
}
