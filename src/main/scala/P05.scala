object P05 {
  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
    println(reverse(List(8)))
    println(reverse(List()))
  }

  def reverse[T](list: List[T]): List[T] = {
    if (list.nonEmpty) list.last :: reverse(list.init) else List()
  }
}
