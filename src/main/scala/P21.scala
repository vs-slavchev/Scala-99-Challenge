object P21 {


  def main(args: Array[String]): Unit = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

  def insertAt(elem: Symbol, index: Int, list: List[Symbol]): List[Symbol] = list match {
    case x :: xs => if (index > 0) x :: insertAt(elem, index - 1, xs) else elem :: x :: xs
    case List() => Nil
  }
}
