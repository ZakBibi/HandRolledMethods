package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZDeepFlattenWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zflatten[A](input: List[A]): ZDeepFlattenWrapper[A] = new ZDeepFlattenWrapper(input)

  it should "flatten a list of integers" in {
    val l = List(List(1, 2, 3))
    l.zflatten shouldBe l.flatten
  }

  it should "flatten a list of characters" in {
    val l = List(List("a", "b", "c"))
    l.zflatten shouldBe l.flatten
  }

  it should "flatten a list of lists of lists" in {
    val l = List(List(1, 2, List(3)))
    l.zflatten shouldBe List(1, 2, 3)
  }

}
