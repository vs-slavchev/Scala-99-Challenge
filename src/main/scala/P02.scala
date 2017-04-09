object P02 {
  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
    println(penultimate(List(1, 2)))
  }

  def penultimate[T](list: List[T]): T = {
    if (list.size > 2) penultimate(list.tail) else list.head
  }
}
