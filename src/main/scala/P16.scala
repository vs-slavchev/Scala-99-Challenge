object P16 {


  def main(args: Array[String]): Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def drop(nth: Int, list: List[Symbol]): List[Symbol] = {
    list.zipWithIndex.filterNot(x => (x._2 + 1) % 3 == 0).map(_._1)
  }
}
