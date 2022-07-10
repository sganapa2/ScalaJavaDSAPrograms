package myscala.programs

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 *         Written on 7/10/2022 6:51 AM
 * Program to SplitListIntoTwo using List.take and List.drop functions
 */
object SplitListIntoTwo extends App {

  def splitList(inputList: List[Int], n:Int): (List[Int], List[Int]) = {
       (inputList.take(n), inputList.drop(n))
  }

  val inputList = List(1,2,3,4,5,6,7,8)
  println(s"Before applying split, list is: $inputList")
  println(s"After applying split, list is: ${splitList(inputList,3)}")
  println(s"After applying split, list is: ${splitList(inputList,4)}")
}
