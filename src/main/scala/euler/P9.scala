package euler

object P9 {


  def isTriplet(a: Int, b: Int, c: Int, sum: Int): Boolean ={
    if((a*a + b*b == c*c) && (a + b + c == sum)) true else false
  }

  def main(args: Array[String]): Unit = {

    val sum = 1000
    val a = for{
      a <- 1 to sum
      b <- a to sum - a
      c <- 1 to sum - a - b
      if isTriplet(a,b,c,sum)
    }yield (a,b,c)
    val b = a.head._1*a.head._2*a.head._3
    println(b)
  }
}

