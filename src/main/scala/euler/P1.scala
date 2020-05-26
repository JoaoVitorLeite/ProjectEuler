package euler

object P1 {
  def main(args: Array[String]): Unit = {

    val a = (1 until 1000).toList.filter(x => (x % 3 == 0) || (x % 5 == 0)).sum
    print(a)
  }
}
