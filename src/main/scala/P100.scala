object P100 {
  def main(args: Array[String]): Unit = {
  }

  def isBalanced(text: String): Boolean = text.toList.foldLeft(0)((sum, c) => if (c == '(') sum + 1 else if (sum <= 0) 1 else sum - 1) == 0

  // recursive inner function
  def processParentheses(list: List[Char], sum: Int): Int = list match {
    case List() => sum
    case x :: xs => if (x == '(') processParentheses(xs, sum + 1)
                    else if (sum <= 0) -1
                    else processParentheses(xs, sum - 1)
  }
}
