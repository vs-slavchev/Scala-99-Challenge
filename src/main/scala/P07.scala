object P07 {
  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
    println(flatten(List(2)))
  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case x :: xs => List(x) ::: flatten(xs)
    case x => List(x)
  }
}
