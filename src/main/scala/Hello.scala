object Hello {
  def main(args: Array[String]) = {
    // println("Hello, world")
    // runArrays()
    //runList()
    // checksum()
    runRational()
  }

  def runRational(): Unit ={
    val x = new Rational(2, 3)
    val y = new Rational(4, 5)
    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x * 2)
  }

  def checksum(): Unit = {
    val checksum = new ChecksumAccumulator
    checksum.add(1)
    checksum.add(5)
    println(checksum.checksum())

    println(ChecksumAccumulator.calculate("Some string"))
    println(ChecksumAccumulator.calculate("Some string"))
  }

  def runArrays() = {
    // val greetStrings = Array("Hello", ", ", "World")  // Array.apply("Hello", ", ", "World")
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello" // greetStrings.update(0, "Hello")
    greetStrings(1) = ", "
    greetStrings(2) = "World"
    for (i <- 0 to 2) // 0.to(2)
      println(greetStrings(i)) // greetStrings.apply(i)
  }

  def runList() = {
    val oneTwo = List(1, 2) // List.apply(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " doesn't mute")
    println(oneTwoThreeFour + " is new list.")

    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)
  }
}