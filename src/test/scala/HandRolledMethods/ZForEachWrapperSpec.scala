package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZForEachWrapperSpec extends AnyFlatSpec with Matchers {

  implicit def zforeach[A](input: List[A]) = new ZForEachWrapper(input)

  it should "print all the elements" in {
    val l = List(1, 2, 3)
    l.zforeach(println) shouldBe l.foreach(println)
  }

  it should "print all the characters" in {
    val l = List("a", "b", "c")
    l.zforeach(println) shouldBe l.foreach(println)
  }

  it should "handle an empty list" in {
    val l = List.empty
    l.zforeach(println) shouldBe l.foreach(println)
  }

}
