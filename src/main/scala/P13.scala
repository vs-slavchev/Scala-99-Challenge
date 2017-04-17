object P13 {


  def main(args: Array[String]): Unit = {
    println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  // break list in important points
  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = list match {
    case Nil => List()
    case _ => val (packed, next) = list.span(_ == list.head)
      (packed.length, packed.head) :: encodeDirect(next)
  }
}
