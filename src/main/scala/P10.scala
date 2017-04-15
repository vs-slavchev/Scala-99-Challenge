object P10 {


  def main(args: Array[String]): Unit = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    P09.pack(list).map(innerList => (innerList.length, innerList.head))
  }
  // build on previous solutions, think about transforming data into related one with map
}
