package lectures.part1basic

object ValuesVariableTypes extends App {
  // VALS ARE IMMUTABLES
  // COMPILER can infer types
  val x = 42
  val y: Int = 56
  println(x)
  println(y)
  println(x+y)

  val aString: String = "Hello"
  val anotherString: String = "Goodbye"
  println(aString)
  println(anotherString)

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  println(aBoolean)
  println(aChar)

  val aInt: Int = x
  println(aInt)

  val aShort: Short = 4163
  val aLong: Long = 1234242312

  println(aShort)
  println(aLong)

  val aFloat: Float = 2.0f
  val aDouble: Double = 3.0

  println(aFloat)
  println(aDouble)

  // varaibles
  var aVar: Int = 4
  aVar = 100 // side effect
  println(aVar)






}
