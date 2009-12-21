object P09 {
  
  def pack[T](l: List[T]): List[List[T]] = {
    if (l.isEmpty) List(List())
    else {
      val (packed, next) = l.span(_ == l.head)
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  
  def main(args : Array[String]) : Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
