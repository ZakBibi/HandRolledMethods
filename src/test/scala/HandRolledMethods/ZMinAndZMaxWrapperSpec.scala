package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMinAndZMaxWrapperSpec extends AnyFlatSpec with Matchers{

  implicit def zminmax[A](input: List[A]) = new ZMinAndZMaxWrapper(input)

  it should "find the min in positive numbers" in {
    val l = List(1, 2, 3)
    l.zmin shouldBe l.min
  }

  it should "find 0" in {
    val l = List(0, 1, 2, 3)
    l.zmin shouldBe l.min
  }

  it should "find the min string" in {
    val l = List("aaa", "aab")
    l.zmin shouldBe l.min
  }

  it should "find the min in negative numbers" in {
    val l = List(-1, -2, -3)
    l.zmin shouldBe l.min
  }

  it should "deal with an empty list like source code min" in {
    val l = List[Int]()
    an [UnsupportedOperationException] shouldBe thrownBy(l.zmin)
  }

  it should "return max" in {
    val l = List(1, 2, 3)
    l.zmax shouldBe l.max
  }

  it should "find the max string" in {
    val l = List("aaa", "aab")
    l.zmax shouldBe l.max
  }

  it should "deal with an empty list like source code max" in {
    val l = List[Int]()
    an [UnsupportedOperationException] shouldBe thrownBy(l.zmax)
  }

}
