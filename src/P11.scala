object P11 {
  
  def encode(l: List[Symbol]): List[Any] = {
    P09.pack(l).map(e => e match {
      case x :: Nil => x
      case x :: xs => (x, xs.length+1)
    })
  } 
  
  def main(args : Array[String]) : Unit = {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(l))
  }
}
