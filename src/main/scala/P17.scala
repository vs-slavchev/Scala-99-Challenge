object P17 {


  def main(args: Array[String]): Unit = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def split(lengthFirst: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = list match {
    case x :: xs => val (first, rest) = split(lengthFirst - 1, xs)
      if (lengthFirst > 0) (x :: first, rest) else (first, x :: rest)
    case List() => (Nil, Nil)
  }
}
