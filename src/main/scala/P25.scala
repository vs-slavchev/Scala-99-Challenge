object P25 {

  def main(args: Array[String]): Unit = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  def randomPermute[T](list: List[T]): List[T] = {
    P23.randomSelect(list.length, list)
  }

}
