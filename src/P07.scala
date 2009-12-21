object P07 {
  
  def flatten(xs: List[Any]): List[Any] = {
    xs flatMap {
      case l: List[_] => flatten(l)
      case e => List(e)
    }
  }
  
  def main(args : Array[String]) : Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
