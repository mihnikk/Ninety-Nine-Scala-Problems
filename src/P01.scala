object P01 {
	def last[T](xs: List[T]): T = {
	  xs match {
	    case e :: Nil => e
	    case _ :: tail => last(tail)
	    case Nil => error("Pusta lista")
	  }
	}
 
	def main(args: Array[String]) {
		val l = List(1,4,7,2,45)
		println(last(l))
	}
}