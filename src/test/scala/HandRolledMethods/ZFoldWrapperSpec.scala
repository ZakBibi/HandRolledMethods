package HandRolledMethods

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZFoldWrapperSpec extends AnyFlatSpec with Matchers{

  implicit def zfold[A](input: List[A]) = new ZFoldWrapper(input)

  it should "perform a fold with a sum" in {
    val l = List(1, 2, 3)
    l.zfold(1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

  it should "perform a fold on elements that are the same" in {
    val l = List(1, 1, 2, 3)
    l.zfold(1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

  it should "manage an empty list" in {
    val l = List.empty
    l.zfold(1)(_ + _) shouldBe l.fold(1)(_ + _)
  }

}
