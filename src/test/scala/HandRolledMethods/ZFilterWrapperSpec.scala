package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFilterWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zfilter[A](input: List[A]): ZFilterWrapper[A] = new ZFilterWrapper(input)

  it should "filter anything larger than 2" in {
    val l = List(1, 2, 3, 4)
    l.zfilter(_ > 2) shouldBe l.filter(_ > 2)
  }

  it should "filter char lists" in {
    val l = List("a", "b", "c")
    l.zfilter(_ != "b") shouldBe l.filter(_ != "b")
  }

  it should "return empty list" in {
    val l = List[Int]()
    l.zfilter(_ > 2) shouldBe l.filter(_ < 2)
  }

}
