package MidsummerNightsDream

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CharacterDecoderSpec extends AnyFlatSpec with Matchers {

  val encoder = new CharacterDecoder

  it should "encode a list of lower case characters" in {
    val l: List[Char] = List('»', '¼', '½')
    encoder.asciiDecoder(l) shouldBe List('a', 'b', 'c')
  }

  it should "encode a list of upper case characters" in {
    val l = List('', '', '')
    encoder.asciiDecoder(l) shouldBe List('A', 'B', 'C')
  }

}
