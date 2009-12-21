object P04 {
  
  def length[T](xs: List[T]): Int = {
    xs match {
      case Nil => 0
      case x :: tail => 1 + length(tail)
    }
  }
  
  def main(args: Array[String]){
    val l = List(1,2,3,4,5,6)
    println(length(l))
  }
}