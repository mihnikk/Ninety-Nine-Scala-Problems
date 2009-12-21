object P02 {

	def lastButOne[T](xs: List[T]): T = {
	  xs match {
	    case e :: _ :: Nil  => e
	    case _ :: tail => lastButOne(tail)
	    case Nil => error("Pusta lista")
	  }
	}
  
	def main(args: Array[String]) {
	  //val l = List(1,2,3,4,5,6,7)
	  val l = List(1,4,5,44,67)
	  println(lastButOne(l))
	}
	
}
