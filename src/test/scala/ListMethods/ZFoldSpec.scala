package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFoldSpec extends AnyFlatSpec with Matchers{

  val f = new ZFold

  it should "perform a fold with a sum" in {
    val l = List(1, 2, 3)
    f.handRolledFold(l, 1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

  it should "perform a fold on elements that are the same" in {
    val l = List(1, 1, 2, 3)
    f.handRolledFold(l, 1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

  it should "manage an empty list" in {
    val l = List.empty
    f.handRolledFold(l, 1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

}
