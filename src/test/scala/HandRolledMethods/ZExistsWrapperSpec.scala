package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ZExistsWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zexists[A](input: List[A]) = new ZExistsWrapper(input)

  it should "apply function to a list of ints" in {
    val l = List(1, 2, 3)
    l.zexists(_ < 3) shouldBe l.exists(_ < 3)
  }

  it should "apply function to a list of chars" in {
    val l = List("a", "b", "c")
    l.zexists(_ == "b") shouldBe l.exists(_ == "b")
  }

  it should "return false when given an empty list" in {
    val l = List[Int]()
    l.zexists(_ < 3) shouldBe l.exists(_ < 3)
  }

}
