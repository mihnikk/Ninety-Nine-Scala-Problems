object P08 {
  
  def compress[T](l: List[T]): List[T] = {
    def compressR(result: List[T], curList: List[T]): List[T] = curList match {
      case e :: tail => compressR(e :: result, tail.dropWhile(_ == e))
      case Nil => result.reverse 
    }
    compressR(Nil, l)
  }
  
  def main(args : Array[String]) : Unit = {
    val l = List(1,1,1,2,2,1,1,2,3,3,4,5,5)
    compress(l).foreach(print _)
  }
}
