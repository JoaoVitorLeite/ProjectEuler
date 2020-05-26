package euler

object P6 {

  def sum(f: Double => Double)(a: Int, b: Int): Double = {
    @scala.annotation.tailrec
    def loop(n: Int, acc: Double): Double={
      if(n > b) acc
      else loop(n+1, f(n) + acc)
    }
    loop(a,0)
  }

  def main(args: Array[String]): Unit = {
    val a = sum(x => x)(1,100)
    val r1 = a * a
    val r2 = sum(x => x*x)(1,100)
    println((r1 - r2).toInt)
  }

}
