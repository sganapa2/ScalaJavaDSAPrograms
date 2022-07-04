package myscala.programs

import scala.annotation.tailrec

object TailrecFactorial extends App {


  @tailrec
  def factorial(n: Int, accumulator: Int ): Int = {
    if(n<=0) accumulator
    else {
      factorial(n-1, n*accumulator)
    }
  }

  val n=3;
  println(s"Factorial of $n is ${factorial(n,1)}")
}
