package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZSpanWrapperSpec extends AnyFlatSpec with Matchers{

  implicit def zspan[A](input: List[A]) = new ZSpanWrapper(input)

  it should "return a correctly split list" in {
    val l = List(1, 2, 3, 4)
    l.zspan(_ < 2) shouldBe l.span(_ < 2)
  }

  it should "do something" in {
    val l = List(1, 2, 3, 4)
    l.zspan(_ < 1) shouldBe l.span(_ < 1)
  }

  it should "return a correctly split list with strings" in {
    val l = List("a", "b", "c", "d")
    l.zspan(_ < "b") shouldBe l.span(_ < "b")
  }

  it should "deal with an empty list" in {
    val l = List[Int]()
    l.zspan(_ < 4) shouldBe l.span(_ < 4)
  }

}