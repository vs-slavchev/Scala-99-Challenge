object P15 {


  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicateN[T](times: Int, list: List[T]): List[T] = {
    list.flatMap(x => List.fill(times)(x))
  }
}
