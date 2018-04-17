import org.scalatest._

class CountOddsSpec extends WordSpec with MustMatchers {

  "CountOdds" must {

    "return 4 when given 8" in {
      CountOdds.count(8) mustEqual 4
    }

    "return 3 when given 7" in {
      CountOdds.count(7) mustEqual 3
    }

  }

}
