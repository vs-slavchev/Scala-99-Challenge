object P09 {


  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = list match {
    case List() => Nil
    case _ => val (first, rest) = list.span(_ == list.head)
              first :: pack(rest)
  }
}
