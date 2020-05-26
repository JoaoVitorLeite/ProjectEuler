package euler

object P3 {

  def factorize(x: Double): List[Double] = {
    def loop(x: Double, a: Double): List[Double] = x % a match {
      case _ if a * a > x  => List(x)
      case 0 => a :: loop(x / a, a)
      case _ => loop(x, a + 1)
    }
    loop(x, 2)
  }

  def main(args: Array[String]): Unit = {
    print(factorize(600851475143D).max)
  }
}
