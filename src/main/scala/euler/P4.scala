package euler

object P4 {

  def palin(x: Int): Boolean ={
    val str1 = x.toString
    val str2 = x.toString.reverse
    str1 == str2
  }

  def mult: Int = {
    val a = for{
      a <- 101 to 999
      b <- 101 to 999
      if palin(a*b)
    }yield a*b
    a.max
  }

  def main(args: Array[String]): Unit = {
    print(mult)
  }
}
