package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMapSpec extends AnyFlatSpec with Matchers {

  val m = new ZMap

  it should "add 1 to all the numbers" in {
    val l = List(1, 2, 3, 4)
    m.handRolledIntMap(l, _ + 1) shouldBe l.map(_ + 1)
  }

  it should "return an empty list" in {
    m.handRolledIntMap(List.empty, _ + 1) shouldBe List.empty
  }

}
