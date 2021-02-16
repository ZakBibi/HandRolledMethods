package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZSplitAtSpec extends AnyFlatSpec with Matchers{

  val s = new ZSplitAt

  it should "return a correctly split list" in {
    val l = List(1, 2, 3, 4)
    s.handRolledSplitAt(l, 3) shouldBe l.splitAt(3)
  }

  it should "deal with an empty list" in {
    s.handRolledSplitAt(List.empty, 3) shouldBe List.empty.splitAt(3)
  }

}
