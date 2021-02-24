package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZSplitAtWrapperSpec extends AnyFlatSpec with Matchers{

  implicit def zsplitAt[A](input: List[A]) = new ZSplitAtWrapper(input)

  it should "return a correctly split list" in {
    val l = List(1, 2, 3, 4)
    l.zsplitAt(3) shouldBe l.splitAt(3)
  }

  it should "return a correctly split list of strings" in {
    val l = List("a", "b", "c")
    l.zsplitAt(2) shouldBe l.splitAt(2)
  }

  it should "deal with an empty list" in {
    val l = List[String]()
    l.zsplitAt(3) shouldBe l.splitAt(3)
  }

  it should "deal with an index out of bounds" in {
    val l = List(1, 2, 3)
    l.zsplitAt(5) shouldBe l.splitAt(5)
  }

}
