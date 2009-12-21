object P06 {
  
  def isPalindrome[T](xs: List[T]): Boolean = xs == xs.reverse
  
  def main(args: Array[String]) {
    val l = List(1,2,3,2,2)
    println(isPalindrome(l))
  }
}
