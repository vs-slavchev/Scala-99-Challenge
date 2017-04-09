object P01 {
  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
    println(last(List(1)))
  }

  def last[T](list: List[T]): T = {
    if (list.size > 1) last(list.tail) else list.head
  }


}
