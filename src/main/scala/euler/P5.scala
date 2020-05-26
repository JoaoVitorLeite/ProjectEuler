package euler

object P5 {

  @scala.annotation.tailrec
  def gcd(x: Long, y: Long): Long = if(y == 0) x else gcd(y, x%y)
  def lcm(x: Long, y: Long): Long = (x*y)/gcd(x,y)

  def main(args: Array[String]): Unit = {
    val a = (1 to 20).toList.map(_.toLong)
    println(a.reduce((a,b) => lcm(a,b)))
  }
}

