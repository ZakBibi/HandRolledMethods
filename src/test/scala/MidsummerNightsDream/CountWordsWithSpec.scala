package MidsummerNightsDream

import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class CountWordsWithSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val ww = new CountWordsWith
  var midsummerLines: List[String] = List[String]()

  override def beforeAll(): Unit = {
    val midsummerFile = Source.fromFile("src/main/resources/MidsummerNightsDream.txt")
    midsummerLines = midsummerFile.getLines().toList
    midsummerFile.close
  }

  it should "find all words with z" in {
    ww.countWordsWith(midsummerLines, "z") shouldBe 15
  }

  it should "find all words with h" in {
    ww.countWordsWith(midsummerLines, "h") shouldBe 4680
  }

  it should "find that ^ has no count" in {
    ww.countWordsWith(midsummerLines, "^") shouldBe 0
  }

}
