object P100 {

  def isBalanced(text: String): Boolean = text.toList.foldLeft(0)((sum, c) => if (c == '(') sum + 1 else if (sum <= 0) return false else sum - 1) == 0

}
