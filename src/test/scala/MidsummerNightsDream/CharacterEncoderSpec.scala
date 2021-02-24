package MidsummerNightsDream

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CharacterEncoderSpec extends AnyFlatSpec with Matchers {

  val encoder = new CharacterEncoder

  it should "encode a list of lower case characters" in {
    val l: List[Char] = List('a', 'b', 'c')
    encoder.asciiEncoder(l) shouldBe List('»', '¼', '½')
  }

  it should "encode a list of upper case characters" in {
    val l = List('A', 'B', 'C')
    val r = List('', '', '')
    for (i <- r)
      println(i.toInt)
    encoder.asciiEncoder(l) shouldBe List('', '', '')
  }

}
