package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Dola", 25)
  println(person.age)
  person.greet("Anuwat")
  person.greet()


}

// constructor
class Person(name: String, val age: Int) {
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I am $name")
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
