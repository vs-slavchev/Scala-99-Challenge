object P19 {


  def main(args: Array[String]): Unit = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def rotate[T](places: Int, list: List[T]): List[T] = list match {
    case x :: xs => if (places > 0) rotate(places - 1, xs :+ x) else x :: xs
    case List() => Nil
  }
}
