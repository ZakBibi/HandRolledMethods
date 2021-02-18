package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ZExistsSpec extends AnyFlatSpec with Matchers {

  val e = new ZExists

  it should "apply function to list" in {
    val l = List(1, 2, 3)
    e.handRolledExists(l, _ < 3) shouldBe l.exists(_ < 3)
  }

  it should "return false when given an empty list" in {
    val l = List[Int]()
    e.handRolledExists(l, _ < 3) shouldBe l.exists(_ < 3)
  }

}
