package MidsummerNightsDream

import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source

class OrderOfAppearanceSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val oOA = new OrderOfAppearance
  var midsummerLines: List[String] = List[String]()

  override def beforeAll(): Unit = {
    val midsummerFile = Source.fromFile("src/main/resources/MidsummerNightsDream.txt")
    midsummerLines = midsummerFile.getLines().toList
    midsummerFile.close
  }

  it should "find if the word is all caps or not" in {
    val s = "HELLO"
    oOA.isCaps(s) shouldBe true
  }

  it should "return false if word is not all caps" in {
    val s = "Hello"
    oOA.isCaps(s) shouldBe false
  }

  it should "return false is word is lowercase" in {
    val s = "hello"
    oOA.isCaps(s) shouldBe false
  }

  it should "return false if word is not all lowercase but not all uppercase either" in {
    val s = "HeLlO"
    oOA.isCaps(s) shouldBe false
  }

  it should "get the names of the characters" in {
    val result = List("BOTTOM", "OBERON", "WALL", "SNOUT",
      "TITANIA", "LION", "STARVELING", "PYRAMUS", "THESEUS", "MOONSHINE",
      "PEASEBLOSSOM", "MOTH", "FLUTE", "HELENA", "QUINCE", "LYSANDER", "HERMIA",
      "EGEUS", "COBWEB", "PUCK", "PHILOSTRATE", "MUSTARDSEED", "SNUG", "DEMETRIUS",
      "HIPPOLYTA", "THISBE")
    oOA.findDramatisPersonae(midsummerLines) shouldBe result
  }

  it should "get the order of appearance" in {
    val result = Set("THESEUS", "HIPPOLYTA", "EGEUS", "HERMIA",
      "DEMETRIUS", "LYSANDER", "HELENA", "QUINCE",
      "BOTTOM", "FLUTE", "STARVELING", "SNOUT", "SNUG", "PUCK",
      "OBERON", "TITANIA", "PYRAMUS", "THISBE", "PEASEBLOSSOM",
      "COBWEB", "MOTH", "MUSTARDSEED", "PHILOSTRATE", "WALL", "LION", "MOONSHINE")

    oOA.orderOfAppearance(midsummerLines, oOA.findDramatisPersonae(midsummerLines)) shouldBe result

  }

  it should "get order of exiting" in {
    val result = Set("PUCK", "OBERON", "TITANIA", "THESEUS",
      "BOTTOM", "DEMETRIUS", "THISBE", "LYSANDER", "HIPPOLYTA",
      "PYRAMUS", "LION", "MOONSHINE", "WALL", "PHILOSTRATE",
      "QUINCE", "FLUTE", "SNUG", "STARVELING", "HELENA", "HERMIA",
      "EGEUS", "MUSTARDSEED", "COBWEB", "PEASEBLOSSOM", "MOTH", "SNOUT")

    val reversedMidsummer = midsummerLines.reverse

    oOA.orderOfAppearance(reversedMidsummer, oOA.findDramatisPersonae(midsummerLines)) shouldBe result

  }

}
