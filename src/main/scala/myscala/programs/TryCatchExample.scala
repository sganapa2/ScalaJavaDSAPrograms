package myscala.programs

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 *         Written on 7/8/2022 5:12 PM
 */
object TryCatchExample extends App {

  try {
       def divide(x: Int, y: Int): Unit = {
         println(s"$x/$y = ${x/y}")
       }

    //divide(1,0)
    divide(10,2)
  }
  catch {
    case ex: ArithmeticException => println(ex.getMessage)
    case ex: Exception => println(ex.getMessage)
  }

}
