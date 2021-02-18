package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMkStringSpec extends AnyFlatSpec with Matchers {

  val ms = new ZMkString

  it should "make a list a string!" in {
    val l = List(1, 2, 3)
    ms.handRolledMkString(l, " ") shouldBe l.mkString(" ")
  }

  it should "deal with an empty list" in {
    ms.handRolledMkString(List.empty, " ") shouldBe List.empty.mkString(" ")
  }

  it should "handle a single element" in {
    val l = List(1)
    ms.handRolledMkString(l, " ") shouldBe l.mkString(" ")
  }

}
