package euler

object P10 {

  def isPrime(d: Long): Boolean ={
    !(2 to math.sqrt(d).toInt).exists(x => d % x == 0)
  }

  @scala.annotation.tailrec
  def sum(n: Long, s: Long): Long ={
    if(n == 2000000) s
    else{
      if(isPrime(n)) sum(n+1, n+s)
      else sum(n+1, s)
    }
  }

  def main(args: Array[String]): Unit = {
    println(sum(2, 0))
  }
}
