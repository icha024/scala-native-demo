package example

object Main {
  def main(args: Array[String]): Unit = {
    val firstArg = args.toList match {
      case head :: _ if head != null => head
      case _ => println("Need ONE arg")
        throw new IllegalArgumentException("Provide one arg")
    }

    println(s"firstArg: $firstArg")
    println("Hello, world!")
  }
}
