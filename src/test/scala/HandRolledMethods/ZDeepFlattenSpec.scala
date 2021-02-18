package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZDeepFlattenSpec extends AnyFlatSpec with Matchers {

  val f = new ZDeepFlatten

  it should "flatten a list of integers" in {
    val l = List(List(1, 2, 3))
    f.handRolledFlatten(l) shouldBe l.flatten
  }

  it should "flatten a list of characters" in {
    val l = List(List("a", "b", "c"))
    f.handRolledFlatten(l) shouldBe l.flatten
  }

  it should "flatten a list of lists of lists" in {
    val l = List(List(1, 2, List(3)))
    f.handRolledFlatten(l) shouldBe List(1, 2, 3)
  }

}
