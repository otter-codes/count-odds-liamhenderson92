object CountOdds extends App {

  def count(input: Int) : Int =
    input match {
    case x if x % 2 == 0 => x /2
    case z => (z-1) / 2
  }

}
