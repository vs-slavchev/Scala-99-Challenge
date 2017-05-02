object P17 {


  def main(args: Array[String]): Unit = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def split[T](lengthFirst: Int, list: List[T]): (List[T], List[T]) = list match {
    case x :: xs => val (first, rest) = split(lengthFirst - 1, xs)
      if (lengthFirst > 0) (x :: first, rest) else (first, x :: rest)
    case List() => (Nil, Nil)
  }
}
