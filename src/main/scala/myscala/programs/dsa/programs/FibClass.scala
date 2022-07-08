package myscala.programs.dsa.programs

import scala.annotation.tailrec

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 *         Written on 7/8/2022 4:45 PM
 */
object FibClass extends App {

    def fib(inputNumber : Int) : Int = inputNumber match {
      case 0 | 1 => inputNumber
      case _ => fib(inputNumber -1)+fib(inputNumber-2)
    }
  println(s"Fib of number 3 is ${fib(3)}")
  println(s"Fib of number 5 is ${fib(5)}")
  println(s"Fib of number 6 is ${fib(6)}")
  println(s"Fib of number 10 is ${fib(10)}")

  println("--------Tailrec------------")
  @tailrec
  def fibTailrec(n : Int, a: Int =0, b: Int = 1) : Int = n match {
    case 0 => a
    case _ => fibTailrec(n-1,b,a+b)
  }
  println(s"Fib of number 3 is ${fibTailrec(3)}")
  println(s"Fib of number 5 is ${fibTailrec(5)}")
  println(s"Fib of number 6 is ${fibTailrec(6)}")
  println(s"Fib of number 10 is ${fibTailrec(10)}")


}
