object P22 {
  
  def range(k: Int, n: Int): List[Int] = {
    //List.range(k,n+1)
    def add(result: List[Int], x: Int, y: Int): List[Int] = {
      if (x != y)
        add(x :: result, x+1, y)
      else
        result.reverse
    }
    add(Nil,k,n+1)
  }
  
  def main(args : Array[String]) : Unit = {
    print(range(2, 11))
  }
}
