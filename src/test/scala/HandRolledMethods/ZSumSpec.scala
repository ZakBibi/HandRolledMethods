package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZSumSpec extends AnyFlatSpec with Matchers {

  val s = new ZSum

  it should "sum the numbers in a list" in {
    val l = List(1, 2, 3)
    s.handRolledSum(l) shouldBe 6
  }

  it should "sum all the negative numbers in a list" in {
    val l = List(-1, -2, -3)
    s.handRolledSum(l) shouldBe -6
  }

  it should "return 0 when given an empty list" in {
    s.handRolledSum(List.empty) shouldBe 0
  }


}
