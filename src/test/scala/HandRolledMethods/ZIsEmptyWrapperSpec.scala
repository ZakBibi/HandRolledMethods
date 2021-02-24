package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZIsEmptyWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zisEmpty[A](input: List[A]) = new ZIsEmptyWrapper(input)

  it should "return true with an empty list" in {
    val l = List[Int]()
    l.zisEmpty shouldBe l.isEmpty
  }

  it should "return false with a non empty list" in {
    val l = List(1, 2, 3)
    l.isEmpty shouldBe l.isEmpty
  }

}
