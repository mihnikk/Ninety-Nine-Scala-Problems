object P05 {
  
  def reverse[T](xs: List[T]): List[T] = {
    xs match {
      case Nil => Nil
      case x :: tail => reverse(tail) ::: List(x)
    }
  }
  
  def main(args: Array[String]) {
    val l = List(1,2,3,4,5)
    reverse(l).foreach(println _)
  }
}