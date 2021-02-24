package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFindWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zfind[A](input: List[A]): ZFindWrapper[A] = new ZFindWrapper(input)

  it should "finds an element when given a true predicate" in {
    val l = List(1, 2, 3)
    l.zfind(_ == 3) shouldBe l.find(_ == 3)
  }

  it should "return none when given a false predicate" in {
    val l = List(1, 2, 3)
    l.zfind(_ < 4) shouldBe l.find(_ < 4)
  }

  it should "find an string when given a true predicate" in {
    val l = List("a", "b", "a")
    l.zfind(_ == "a") shouldBe l.find(_ == "a")
  }

  it should "return none when given an empty list" in {
    val l = List[String]()
    l.zfind(_ == "a") shouldBe l.find(_ == "a")
  }

}
