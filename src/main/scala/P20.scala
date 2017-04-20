object P20 {


  def main(args: Array[String]): Unit = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  def removeAt(index: Int, list: List[Symbol]): (List[Symbol], Symbol) = list match {
    case x :: xs =>
      if (index > 0) {
        val (innerList, removedElement) = removeAt(index - 1, xs)
        (x :: innerList, removedElement)
      } else (xs, x)
    case List() => throw new NoSuchElementException
  }
}
