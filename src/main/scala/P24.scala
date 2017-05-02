object P24 {

  def main(args: Array[String]): Unit = {
    println(lotto(6, 49))
  }

  def lotto(times: Int, total: Int): List[Int] = {
    P23.randomSelect(times, List.range(1, total + 1))
  }
}
