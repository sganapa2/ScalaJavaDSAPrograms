package myscala.programs.dsa.programs

import scala.concurrent.duration.{DurationInt, FiniteDuration}

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 *         Written on 7/7/2022 10:05 PM
 */
object ImplicitsExample extends App {

  implicit val textPrefix: String = "Hello " // implicit declaration can be of type val, var, def or class

  implicit val finiteTimeoutDuration : FiniteDuration = 5.second

  implicit val finiteTimeoutDurationIntegerType : Int = 10

  def sayHello(name: String)(implicit prefix: String) = {
     s"$prefix $name"
  }

  println(sayHello("Santosh")) //no need to provide second parameter to the currying function for prefix implicit
  //sayHello("santosh")(1)//Type missmatch error, as implicit expects/defined of type String whereas we trying to pass int 1

  def someLongRunningTask()(implicit timeoutDuration: FiniteDuration) : String = {
    "Some long running task"
  }

  def someLongRunningTaskOfIntegerImplicit()(implicit timeoutDuration: Int) : String = {
    "Some long running task of int type implicit"
  }

  //Use implicits - to extend the functionality of closed classes like final class String
  // example "ABC" -> "BCD"

  implicit class extendString(str: String) {
    def incrementStringChars: String = str.map((c: Char) => (c+1).toChar)
  }

  println("ABC".incrementStringChars)


}
