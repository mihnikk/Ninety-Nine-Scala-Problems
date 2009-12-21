object P18 {
  
  def slice[T](n: Int, k: Int, l: List[T]): List[T] = {
    l.drop(n).take(k-n)
  }
  
  def main(args : Array[String]) : Unit = {
    print(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
