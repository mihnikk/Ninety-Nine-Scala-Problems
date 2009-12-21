object P17 {
  
  def split[T](n: Int, l: List[T]): (List[T],List[T]) = {
    l.splitAt(n)
  }
  
  def main(args : Array[String]) : Unit = {
    print(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
