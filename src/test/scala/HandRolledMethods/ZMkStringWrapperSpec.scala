package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZMkStringWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zmkString[A](input: List[A]) = new ZMkStringWrapper(input)

  it should "make a list a string!" in {
    val l = List(1, 2, 3)
    l.zmkString(" ") shouldBe l.mkString(" ")
  }

  it should "deal with strings" in {
    val l = List("a", "b", "c")
    l.zmkString(" ") shouldBe l.mkString(" ")
  }

  it should "deal with an empty list" in {
    val l = List[String]()
    l.zmkString(" ") shouldBe List.empty.mkString(" ")
  }

  it should "handle a single element" in {
    val l = List(1)
    l.zmkString(" ") shouldBe l.mkString(" ")
  }

}
