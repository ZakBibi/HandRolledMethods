package ListMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class
ZGroupBySpec extends AnyFlatSpec with Matchers {

  val gb = new ZGroupBy

  it should "group by int" in {
    val v = List((1, "a"), (1, "b"), (2, "c"))
    gb.handRolledGroupBy(v) shouldBe Map(1 -> List("a", "b"), 2 -> List("c"))
  }

  it should "group by int and put similar values with the same key" in {
    val v = List((1, "a"), (1, "a"), (2, "b"))
    gb.handRolledGroupBy(v) shouldBe Map(1 -> List("a", "a"), 2 -> List("b"))
  }

}
