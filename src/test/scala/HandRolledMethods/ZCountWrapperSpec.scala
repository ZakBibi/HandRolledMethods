package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZCountWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zcount[A](input: List[A]): ZCountWrapper[A] = new ZCountWrapper(input)

  it should "count all the numbers less than 3" in {
    val l = List(1, 2, 3)
    l.zcount(_ < 3) shouldBe l.count(_ < 3)
  }

  it should "count all the letters that are b" in {
    val l = List("a", "b", "c", "b")
    l.zcount(_ == "b") shouldBe l.count(_ == "b")
  }

  it should "give 0 when passed an empty list" in {
    val l = List[Int]()
    l.zcount(_ < 3) shouldBe 0
  }

}
