package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMapWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zmap[A](input: List[A]): ZMapWrapper[A] = new ZMapWrapper(input)

  it should "add 1 to all the numbers" in {
    val l = List(1, 2, 3, 4)
    l.zmap(_ + 1) shouldBe l.map(_ + 1)
  }

  it should "return an empty list" in {
    val l = List[Int]()
    l.zmap(_ + 1) shouldBe l.map(_ + 1)
  }

}
