package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Dola", 25)
  println(person.age)
  person.greet("Anuwat")
  person.greet()

  val author = new Writer("Jason", "Borne", 1995)
  val novel = new Novel("How to be SPY", 2000, author)
  val imposter = new Writer("John", "Bavoa", 1995)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc(10).inc(50).dec(10).dec(10).print



}

// constructor
class Person(name: String, val age: Int) {
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I am $name")
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}


class Writer(firstName: String, surName: String, val year: Int) {
  def fullName: String = firstName + "  " + surName
}

class Novel(name: String, year: Int, author: Writer){
  def authorAge: Int = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)

}
