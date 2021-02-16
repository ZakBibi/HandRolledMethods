package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMinAndZMaxSpec extends AnyFlatSpec with Matchers{

  val minMax = new ZMinAndZMax

  it should "find the min in positive numbers" in {
    val l = List(1, 2, 3)
    minMax.handRolledMin(l) shouldBe 1
  }

  it should "find 0" in {
    val l = List(0, 1, 2, 3)
    minMax.handRolledMin(l) shouldBe 0
  }

  it should "find the min in negative numbers" in {
    val l = List(-1, -2, -3)
    minMax.handRolledMin(l) shouldBe -3
  }

  it should "return 0 with an empty list in min" in {
    minMax.handRolledMin(List.empty) shouldBe 0
  }

  it should "return max" in {
    val l = List(1, 2, 3)
    minMax.handRolledMax(l) shouldBe 3
  }

  it should "return 0 with an empty list in max" in {
    minMax.handRolledMax(List.empty) shouldBe 0
  }

}
