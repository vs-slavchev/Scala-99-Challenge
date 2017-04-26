import scala.util.Random

object P23 {

  val random = new Random()

  def main(args: Array[String]): Unit = {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  def randomSelect(times: Int, list: List[Symbol]): List[Symbol] = {
    if (times > 0) {
      val (smallerList, taken) = P20.removeAt(random.nextInt(list.length), list)
      taken :: randomSelect(times - 1, smallerList)
    } else {
      List()
    }
  }
}
