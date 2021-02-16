package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZCountSpec extends AnyFlatSpec with Matchers {

  val c = new ZCount

  it should "count all the numbers" in {
    val l = List(1, 2, 3)
    c.handRolledCount(l, _ < 3) shouldBe l.count(_ < 3)
  }

  it should "give 0 when passed an empty list" in {
    c.handRolledCount(List.empty, _ < 3) shouldBe 0
  }

}
