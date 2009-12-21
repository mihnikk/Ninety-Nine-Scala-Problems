object P03 {

  def nth[T](n: Int, xs: List[T]): T = {
    (n, xs) match {
      case (0, e :: tail) => e
      case (m, e :: tail) => nth(m-1,tail)
      case (_, _) => error("B³¹d")
    }
  }
  
  def main(args: Array[String]) {
    val l = List(2,4,6,8,10)
    println(nth(4,l))
  }
  
}
