package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZForAllWrapperSpec extends AnyFlatSpec with Matchers{

  implicit def zforall[A](input: List[A]) = new ZForAllWrapper(input)

  it should "return false when predicate is not met" in {
    val l = List(1, 2, 3)
    l.zforall(_ < 2) shouldBe l.forall(_ < 2)
    l.min
  }

  it should "return true when predicate is met" in {
    val l = List(1, 2, 3)
    l.zforall(_ < 5) shouldBe l.forall(_ < 5)
  }

  it should "return false when given an empty list" in {
    val l = List[String]()
    l.zforall(_ == "n") shouldBe false
  }

}
