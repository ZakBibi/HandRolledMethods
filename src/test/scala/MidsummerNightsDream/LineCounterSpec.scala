package MidsummerNightsDream

import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.io.Source

class LineCounterSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  val lc = new LineCounter
  val c = new IsCase
  var midsummerLines: List[String] = List[String]()

  override def beforeAll(): Unit = {
    val midsummerFile = Source.fromFile("src/main/resources/MidsummerNightsDream.txt")
    midsummerLines = midsummerFile.getLines().toList
    midsummerFile.close
  }

  it should "find how many lines Hermia has" in {
    ???
  }



}
