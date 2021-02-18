package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZIsEmptySpec extends AnyFlatSpec with Matchers {

  val e = new ZIsEmpty

  it should "return true with an empty list" in {
    e.handRolledIsEmpty(List.empty) shouldBe true
  }

  it should "return false with a non empty list" in {
    val l = List(1, 2, 3)
    e.handRolledIsEmpty(l) shouldBe false
  }

}
