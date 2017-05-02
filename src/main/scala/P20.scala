object P20 {


  def main(args: Array[String]): Unit = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  def removeAt[A](index: Int, list: List[A]): (List[A], A) = list match {
    case x :: xs =>
      if (index > 0) {
        val (innerList, removedElement) = removeAt(index - 1, xs)
        (x :: innerList, removedElement)
      } else (xs, x)
    case List() => throw new NoSuchElementException
  }
}
