object P12 {


  def main(args: Array[String]): Unit = {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }

  def decode[T](list: List[(Int, T)]): List[T] = list match {
    case (first, second) :: xs => List.fill(first)(second) ::: decode(xs)
    case List() => Nil
  }
}
