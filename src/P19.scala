object P19 {
  
  def rotate[T](n: Int, l: List[T]): List[T] = {
    (n, l) match {
      case (_, Nil) => Nil
      case (a, b) if (a == 0) => b
      case (a, b) if (a > 0) => b.drop(a) ::: b.take(a)
      case (a, b) if (a < 0) => b.takeRight(-a) ::: b.drop(a)
    }
  }
  
  def main(args : Array[String]) : Unit = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
