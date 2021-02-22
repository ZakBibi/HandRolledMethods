package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZContainsWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zcontains[A](input: List[A]): ZContainsWrapper[A] = new ZContainsWrapper(input)

  it should "find the given number" in {
    val l = List(1, 2, 3)
    l.zcontains(3) shouldBe l.contains(3)
  }

  it should "give false when the number doesn't exist" in {
    val l = List(1, 2, 3)
    l.zcontains(4) shouldBe l.contains(4)
  }

  it should "find the given character" in {
    val l = List("a", "b", "c")
    l.zcontains("b") shouldBe l.contains("b")
  }

  it should "find the given string" in {
    val l = List("The", "hot", "dog")
    l.zcontains("dog") shouldBe l.contains("dog")
  }

  it should "give false when given an empty list" in {
    val l = List[Int]()
    l.zcontains(2) shouldBe List.empty.contains(2)
  }

}
