package lectures.part1basic

object CBNvsCBV extends App {

  def callByVal(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: => Long): Unit = { // "=>" tell cpl to call by name
    println("by name: " + x)
    println("by name: " + x)
  }

  callByVal(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite())



}
