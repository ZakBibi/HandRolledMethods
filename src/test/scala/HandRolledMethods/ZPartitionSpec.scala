package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZPartitionSpec extends AnyFlatSpec with Matchers {

  val p = new ZPartition

  it should "return a correctly partitioned list" in {
    val l = List(5, 2, 2, 2, 3, 3, 4)
    p.handRolledPartition(l, _ < 3) shouldBe l.partition(_ < 3)
  }

  it should "return empty lists when given an empty list" in {
    p.handRolledPartition(List.empty, _ < 4) shouldBe (List.empty, List.empty)
  }

}
