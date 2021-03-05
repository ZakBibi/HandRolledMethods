package MidsummerNightsDream

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IsCaseSpec extends AnyFlatSpec with Matchers {

  val c = new IsCase

  it should "find if the word is all caps or not" in {
    val s = "HELLO"
    c.isCaps(s) shouldBe true
  }

  it should "return false if word is not all caps" in {
    val s = "Hello"
    c.isCaps(s) shouldBe false
  }

  it should "return false is word is lowercase" in {
    val s = "hello"
    c.isCaps(s) shouldBe false
  }

  it should "return false if word is not all lowercase but not all uppercase either" in {
    val s = "HeLlO"
    c.isCaps(s) shouldBe false
  }

  it should "find if the word is all lowercase" in {
    val s = "hello"
    c.isLowerCase(s) shouldBe true
  }

  it should "find if word is not all lower case" in {
    val s = "Hello"
    c.isLowerCase(s) shouldBe false
  }

  it should "return false if word is uppercase" in {
    val s = "HELLO"
    c.isLowerCase(s) shouldBe false
  }


}
