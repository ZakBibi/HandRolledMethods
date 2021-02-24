package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZPartitionWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zpartition[A](input: List[A]) = new ZPartitionWrapper(input)

  it should "return a correctly partitioned list" in {
    val l = List(5, 2, 2, 2, 3, 3, 4)
    l.zpartition(_ < 3) shouldBe l.partition(_ < 3)
  }

  it should "return a correctly partitioned list of strings" in {
    val l = List("a", "a", "a", "b", "b")
    l.zpartition(_ == "b") shouldBe l.partition(_ == "b")
  }

  it should "return empty lists when given an empty list" in {
    val l = List[String]()
    l.zpartition(_ == "b") shouldBe l.partition(_ == "b")
  }

}
