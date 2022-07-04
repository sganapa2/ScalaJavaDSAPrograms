package myscala.programs

object ForLoop extends App {

  // using "to" includes End value
  for(i <- 1 to 10) {
    println(i)
  }

  // using "until" excludes End value like for example 1 until 1o is nothing but 1 to 9 (n-1)
  for(i <- 1 until 10) {
    println(i)
  }

  //for loop with list of objects
  val lst = List(0,1,2,"str",4,5,6,7,8,9)

  for(i <- lst) {
    println(i)
  }

  // For loop with filters (withFilter) conditions in for loop
  val intList = List(1,2,3,4,5,6,7,8)
  println("EventNumber list is: ")
  for(i<- intList if(i%2==0)) {
      println(i)
  }

  println("ODD list is: ")
  for(i<- intList if(i%2!=0)) {
    println(i)
  }
}
