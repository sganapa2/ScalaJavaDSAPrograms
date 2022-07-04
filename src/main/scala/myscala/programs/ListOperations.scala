package myscala.programs

import scala.::


/**
 *   1. Scala list is immutable
 *   2. Its a linked list representation
 */
object ListOperations extends App {

  //int list
  val intList : List[Int] = List(1,2,3,4)

  //string List
  val stringList: List[String] = List("a","b","c")

  //Creating list by using cons operator (::)
  val consList: List[Int] = 1::2::3::4::Nil

  println(s"int list is: $consList")

  println(s"String list is:$stringList ")
  //head
  println(s"First element in list is: ${stringList.head}")

  //tail excluding first element
  println(s"Tail elements of the list is: ${stringList.tail}")

  //list isEmpty
  println(s"Is consList is empty or not: ${consList.isEmpty}")

  //Concat lists in 3 ways
  //1. Using ::: Operator
  //2. List.::: Operator
  //3. concat method

  val concatedList = intList ::: stringList
  println(s"Concated list in 1st way is: $concatedList")

  val concatedSecondList = intList.:::(stringList)
  println(s"Concated list in 2nd way is: $concatedSecondList")

  val concatedThirdList = List.concat(intList,stringList)
  println(s"Concated list in 3rd way using concat method is: $concatedThirdList")

  //reveres list using revers method
  println(s"Reverse list: Original list:$consList Reversed list is:${consList.reverse}")


  // apply method is used to get the elements of list using index
  // getting elements of list using apply method
  consList.apply(2)
  print(s"2nd index element in $consList is: ${consList.apply(2)}")


  //check if element exist or not in list
  consList.contains(2)
  println(s"Is conslist contains 2? list:$consList has 2?: ${consList.contains(2)}")
  println(s"list:$consList has 12?: ${consList.contains(12)}")

}
