package euler

object P2 {

  def fib(x: Int, y: Int): LazyList[Int] = {
    x #:: fib(y, x+y)
  }

  def main(args: Array[String]): Unit = {
    print(fib(1,2).takeWhile(x => x < 4000000).filter(x => x % 2 == 0).sum)
  }
}
