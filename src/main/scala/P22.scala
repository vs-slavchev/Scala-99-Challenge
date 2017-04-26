object P22 {


  def main(args: Array[String]): Unit = {
    println(range(4, 9))
  }

  def range(start: Int, end: Int): List[Int] = {
    if (start <= end)
    {
      start :: range(start + 1, end)
    } else {
      List()
    }
  }
}
