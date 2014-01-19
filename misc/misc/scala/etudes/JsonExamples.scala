package misc.scala.etudes

import play.api.libs.json.JsObject;
import play.api.libs.json.Json;

object JsonExamples {
  
  def jsonKeysExample(): Unit = {
    val json1 = JsObject(Seq("experiment1" -> Json.toJson("search20130416=T")))
    val json2 = json1 ++ JsObject("experiment2" -> Json.toJson("search20130416=C") :: Nil)
    println(json1)
    println(json2)    
  }
  /**
   * You cannot have same json key names.
   */
  def main(args: Array[String]) {
    jsonKeysExample();
  }
}