object P04 {
  def main(args: Array[String]): Unit = {
    println(length(List(1, 1, 2, 3, 5, 8)))
    println(length(List(8)))
    println(length(List()))
  }

  def length[T](list: List[T]): Int = {
    if (list.nonEmpty) 1 + length(list.tail) else 0
  }
}
