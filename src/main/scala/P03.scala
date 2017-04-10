object P03 {
  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
    println(nth(2, List(3, 5, 8)))
  }

  def nth[T](n: Int, list: List[T]): T = {
    if (n <= 0) list.head else nth(n - 1, list.tail)
  }
}
