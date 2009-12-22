object P20 {
  
  def removeAt[T](k: Int, l: List[T]): (List[T],T) = {
    (l.filter(l.indexOf(_) != k), l(k))
  }
  
  def main(args : Array[String]) : Unit = {
    print(removeAt(1, List('a, 'b, 'c, 'd)))
  }
}
