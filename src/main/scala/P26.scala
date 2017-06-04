object P26 {

  def main(args: Array[String]): Unit = {
    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  def combinations[T](takes: Int, list: List[T]): List[List[T]] = list.combinations(takes).toList
}
