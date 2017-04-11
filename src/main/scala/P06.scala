object P06 {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(1, 1, 2, 3, 5, 8)))
    println(isPalindrome(List(8, 4, 6, 4, 8)))
    println(isPalindrome(List()))
  }

  def isPalindrome[T](list: List[T]): Boolean = {
    if(list.size <= 1) {
      true
    } else if (list.head == list.last) {
      isPalindrome(list.init.tail)
    } else {
      false
    }
  }
}
