package euler

object P7{

  def isPrime(n: Double): Boolean = !(2 to math.sqrt(n).toInt).exists(n % _ == 0)

  def main(args: Array[String]): Unit = {
    val n:LazyList[Int] = LazyList.from(2).filter(x => isPrime(x)).slice(10000, 10001)
    print(n.force)
  }

}
