object P16 {
  
  
  def drop[T](n: Int, l: List[T]): List[T] = {
    l.filter(x => (l.indexOf(x)+1) % n != 0)
  }
  def main(args : Array[String]) : Unit = {
    print(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
