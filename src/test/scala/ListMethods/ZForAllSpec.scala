package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZForAllSpec extends AnyFlatSpec with Matchers{

  val f = new ZForAll

  it should "return false when predicate is not met" in {
    val l = List(1, 2, 3)
    f.handRolledForAll(l, _ < 2) shouldBe l.forall(_ < 2)
  }

  it should "return true when predicate is met" in {
    val l = List(1, 2, 3)
    f.handRolledForAll(l, _ < 5) shouldBe l.forall(_ < 5)
  }

  it should "return false when given an empty list" in {
    f.handRolledForAll(List.empty, _ < 4) shouldBe false
  }

}
