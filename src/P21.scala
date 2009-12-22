object P21 {
  
  def insertAt[T](x: T, n: Int, l:List[T]): List[T] = {
    l.splitAt(n) match {
      case (pre, Nil) => error("B³¹d")
      case (pre, post) => pre ::: (x :: post)
    }
  }
  
  def main(args : Array[String]) : Unit = {
    print(insertAt('new, 3, List('a, 'b, 'c, 'd)))
  }
}
