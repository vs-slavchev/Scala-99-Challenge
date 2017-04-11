object P08 {
  def main(args: Array[String]): Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(compressMatched(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  // initial solution ;(
  def compress(list: List[Symbol]): List[Symbol] = {
    if (list.size == 1) {
      list
    } else if (list.head == list(1)) {
      compress(list.tail)
    } else {
      list.head :: compress(list.tail)
    }
  }

  // after having the bravery to use matching
  def compressMatched(list: List[Symbol]): List[Symbol] = list match {
    case List(x) => List(x)
    case x :: xs => if (x == xs.head) compressMatched(xs) else x :: compressMatched(xs)
  }
}
