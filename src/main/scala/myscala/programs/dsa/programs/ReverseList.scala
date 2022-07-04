package myscala.programs.dsa.programs

object ReverseList extends App {

  var simpleIntList: List[Int] = List(1,2,3,4,5,6)

  var start=0
  var end = simpleIntList.length-1

  var outputList: List[Int] = List.empty

  while(start<=end) {
    var temp = simpleIntList.apply(end)
    simpleIntList.take(start)
    start= start+1


  }

  def reverse(inputList: List[Int]) {
    var start:Int =0
    var end: Int = inputList.length - 1

    while(start<=end) {
      val temp = inputList.apply(start)
     // inputList.add(start, inputList.apply(end))

    }
  }
}
