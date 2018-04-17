object CountOdds extends App {

  def count(input: Int) : Int =
    input match {
    case even if even % 2 == 0 => even /2
    case odd => (odd-1) / 2
  }

}
