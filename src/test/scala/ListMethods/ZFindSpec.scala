package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFindSpec extends AnyFlatSpec with Matchers {

  val f = new ZFind

  it should "finds an element when given a true predicate" in {
    val l = List(1, 2, 3)
    f.handRolledFind(l, _ == 3) shouldBe l.find(_ == 3)
  }

  it should "return none when given a false predicate" in {
    val l = List(1, 2, 3)
    f.handRolledFind(l, _ < 4) shouldBe l.find(_ < 4)
  }

  it should "return none when given an empty list" in {
    f.handRolledFind(List.empty, _ < 4) shouldBe None
  }

}
