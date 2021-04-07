package lectures.part1basic

import scala.annotation.tailrec

object Recursions extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n
        + " - I need first factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
//  println(factorial(10))
//  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator)

    factorialHelper(n, 1)
  }



  println(anotherFactorial(5000))

  // WHEN you need loop use tail recursion

  @tailrec
  def concatTailrec(aString: String,
                    n: Int,
                    accumulator: String): String =
    if (n <= 0) accumulator
    else concatTailrec(aString, n-1, aString + accumulator)

  println(concatTailrec("Hello", 3, ""))


}
