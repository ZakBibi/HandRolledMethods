package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZSpanSpec extends AnyFlatSpec with Matchers{

  val s = new ZSpan

  it should "return a correctly split list" in {
    val l = List(1, 2, 3, 4)
    s.handRolledSpan(l, _ < 3) shouldBe l.span(_ < 3)
  }

  it should "deal with an empty list" in {
    s.handRolledSpan(List.empty, _ < 4) shouldBe (List.empty, List.empty)
  }

}