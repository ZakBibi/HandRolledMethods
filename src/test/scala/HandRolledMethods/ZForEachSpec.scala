package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZForEachSpec extends AnyFlatSpec with Matchers {

  val f = new ZForEach

  it should "print all the elements" in {
    val l = List(1, 2, 3)
    f.handRolledForEach(l, println) shouldBe l.foreach(println)
  }

  it should "print all the characters" in {
    val l = List(1, 2, 3)
    f.handRolledForEach(l, println) shouldBe l.foreach(println)
  }

  it should "handle an empty list" in {
    val l = List.empty
    f.handRolledForEach(l, println) shouldBe l.foreach(println)
  }

}
