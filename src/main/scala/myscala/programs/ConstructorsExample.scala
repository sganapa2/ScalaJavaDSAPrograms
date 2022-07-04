package myscala.programs

object ConstructorsExample extends App {

  val person = new Person("Santosh", "Ganapa")
  println(person.getName())
}

class Person(var firstName: String, var lastName: String) {

  println("The constructor began")
  //state
  val age = 10

  //Behaviour

  firstName = "Its var, hence overriden name as Santoo"
  def getName(): String = s"$firstName $lastName"
}
