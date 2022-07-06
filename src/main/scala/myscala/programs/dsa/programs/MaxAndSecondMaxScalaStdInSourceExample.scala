package myscala.programs.dsa.programs

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 *         Written on 7/6/2022 1:47 PM
 */
object MaxAndSecondMaxScalaStdInSourceExample extends App {

  val inputNumberOfElements = io.StdIn.readInt()

  val inputElements = io.Source.stdin.getLines().take(inputNumberOfElements).map(_.toInt).toList

  val resuleTuple = if(inputElements.nonEmpty) {
    var max1: Int = inputElements.head
    var max2: Int = max1

    for(i <- 1 until inputElements.length) {
      if(max1<inputElements(i)) {
          max2 = max1
          max1 = inputElements(i)
      }
    }
    (max1, max2)
  }
  println(s"Max1 and second max from resuleTuple is: $resuleTuple")

}
