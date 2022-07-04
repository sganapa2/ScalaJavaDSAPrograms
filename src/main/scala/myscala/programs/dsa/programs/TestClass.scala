package myscala.programs.dsa.programs

object TestClass extends App {

  case class Person(firstName: String, var lastName: String)

  println("Start of constructor")
  lazy val  add = (a1: Int, a2: Int ) => println(s"a1+a2= ${a1+a2}")

  println("Lazy val add not printed")


  val person = Person("Santosh", "Ganapa")

   val isSantosh = person match {
     case Person("Santosh", _) => true
     case _ => false
   }

  println(s"Is this Santosh? $isSantosh")

  println("End of program")

  add(1,2)

}
