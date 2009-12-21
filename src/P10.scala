object P10 {
  
  def encode(l: List[Symbol]): List[(Int,Symbol)] = {
    P09.pack(l).map(x => (x.length, x.head))
  }
  
  def main(args : Array[String]) : Unit = {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(l))
  }
}
