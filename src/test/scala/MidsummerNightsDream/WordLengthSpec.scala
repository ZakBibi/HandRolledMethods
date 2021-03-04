package MidsummerNightsDream

import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source

class WordLengthSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val wl = new WordLength
  var midsummerLines: List[String] = List[String]()

  override def beforeAll(): Unit = {
    val midsummerFile = Source.fromFile("src/main/resources/MidsummerNightsDream.txt")
    midsummerLines = midsummerFile.getLines().toList
    midsummerFile.close
  }

  it should "find all the words that are longer than 7 characters" in {
    wl.countGreaterThanLength(midsummerLines, 7) shouldBe 3450
  }

  it should "find all words that are shorter than 7 characters" in {
    wl.countLessThanLength(midsummerLines, 7) shouldBe 18268
  }

}
