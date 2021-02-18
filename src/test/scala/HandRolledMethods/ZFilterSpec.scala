package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFilterSpec extends AnyFlatSpec with Matchers {

  val f = new ZFilter

  it should "filter anything larger than 2" in {
    val l = List(1, 2, 3, 4)
    f.handRolledFilter(l, _ > 2) shouldBe l.filter(_ > 2)
  }

  it should "return empty list" in {
    f.handRolledFilter(List.empty, _ > 2) shouldBe List.empty
  }

}
