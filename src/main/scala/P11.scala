object P11 {


  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encodeModified(list: List[Symbol]): List[Any] = {
    P09.pack(list).map(
        innerList => {
          if (innerList.length == 1) innerList.head else (innerList.length, innerList.head)
        })
  }
}
