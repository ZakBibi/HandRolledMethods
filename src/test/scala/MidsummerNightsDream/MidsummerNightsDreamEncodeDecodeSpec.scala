package MidsummerNightsDream


import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source

class MidsummerNightsDreamEncodeDecodeSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val encoder = new CharacterEncoder
  val decoder = new CharacterDecoder

  var midsummerLines: List[String] = List[String]()

  override def beforeAll(): Unit = {
    val midsummerFile = Source.fromFile("src/main/resources/MidsummerNightsDream.txt")
    midsummerLines = midsummerFile.getLines().toList
    midsummerFile.close
  }

  it should "encode and decode" in {
    val result = List('a', 'b', 'c')
    val encodedResult = encoder.asciiEncoder(result)
    decoder.asciiDecoder(encodedResult) shouldBe result
  }

//  it should "encode Midsummer Nights Dream and decode it again" in {
//    val flattenedMidsummer = midsummerLines.flatten
//    val encodedMidsummer = encoder.asciiEncoder(flattenedMidsummer)
//    decoder.asciiDecoder(encodedMidsummer) shouldBe flattenedMidsummer
//  }



}
