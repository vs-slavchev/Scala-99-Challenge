object P14 {


  def main(args: Array[String]): Unit = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicate[A](list: List[A]): List[A] = list match {
    case x :: xs => x :: x :: duplicate(xs)
    case List() => Nil
  }
}
