package lectures.part1basic

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,20))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')

  val aA = "Data1"
  val bB = "Data2"

  println(aA :+ "x")
  println(str.reverse)
  println(str.take(2))

  // S-Interpolators

  val name = "Anuwat"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."

  println(greeting)

  val anotherGreeting = s"Hello, my name is $name and I will be turning" +
    s" ${age + 1} years old."

  println(anotherGreeting)

  // F-Interpolators

  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // Raw-Interpolators
  println(raw"This is a \n newline")

  val escaped = "this is a \n newline"
  println(raw"$escaped")








}
