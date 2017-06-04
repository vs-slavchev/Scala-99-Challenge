object P28 {

  def main(args: Array[String]): Unit = {
    val listOfLists = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h),
      List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))

    println(lsort(listOfLists))
    println(lsortFreq(listOfLists))

  }

  def lsort[T](list: List[List[T]]): List[List[T]] = {
    list.sortBy(_.length)
  }

  def lsortFreq[Symbol](list: List[List[Symbol]]) : List[List[Symbol]] = {
    val frequencies = list.map(_.length).map(len => list.filter(_.length == len).length)
    list.sortWith((e1, e2) => frequencies(e1.length) < frequencies(e2.length))
  }
}
