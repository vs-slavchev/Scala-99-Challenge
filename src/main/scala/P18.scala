object P18 {


  def main(args: Array[String]): Unit = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def slice(firstIndex: Int, endIndex: Int, list: List[Symbol]): List[Symbol] = list match {
    case x :: xs => val remainingList = slice(firstIndex - 1, endIndex - 1, xs)
      if (firstIndex <= 0 && endIndex > 0) x :: remainingList else remainingList
    case List() => Nil
  }
}
