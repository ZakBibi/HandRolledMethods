package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZContainsSpec extends AnyFlatSpec with Matchers {

  val c = new ZContains

  it should "find the given number" in {
    val l = List(1, 2, 3)
    c.handRolledContains(l, 3) shouldBe l.contains(3)
  }

  it should "give false when the number doesn't exist" in {
    val l = List(1, 2, 3)
    c.handRolledContains(l, 4) shouldBe l.contains(4)
  }

  it should "give false when given an empty list" in {
    c.handRolledContains(List.empty, 2) shouldBe List.empty.contains(2)
  }

}
