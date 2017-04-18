object P15 {


  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicateN(times: Int, list: List[Symbol]): List[Symbol] = {
    list.flatMap(x => List.fill(times)(x))
  }
}
