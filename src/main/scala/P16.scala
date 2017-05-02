object P16 {


  def main(args: Array[String]): Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def drop[T](nth: Int, list: List[T]): List[T] = {
    list.zipWithIndex.filterNot(x => (x._2 + 1) % 3 == 0).map(_._1)
  }
}
