package lectures.part1basic

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4) // + - * / & | ^ << >> >>>
  println(1 == x) // == != > >= < <=
  println(!(1 == x)) // ! && ||

  var aVar = 2
  aVar += 3 // -= *= /=
  println(aVar)

  // Instruction (DO) vs Expression (VALUE)
  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF expression

  println(aConditionValue)
  println(if(!aCondition) 5 else 3)
  print(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // never write this again
  // everything in scala is an Expression

  val aWeirdValue = (aVar = 3) // Unit === void
  println(aWeirdValue)
  println(aWhile)

  // side effect: println(), while, reassigning

  // code block
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)


}
