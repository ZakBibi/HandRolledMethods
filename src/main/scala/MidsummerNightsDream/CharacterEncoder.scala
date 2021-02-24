package MidsummerNightsDream

import scala.annotation.tailrec

class CharacterEncoder {

  def asciiEncoder(context: List[Char]): List[Char] = {
    val zAscii = 'Z'.toInt  //90
    @tailrec
    def encoderRec(l: List[Char], currentCollection: List[Char]): List[Char] = {
      l match {
        case Nil => currentCollection
        case x :: xs =>
          val newChar = x + zAscii
          encoderRec(xs, currentCollection :+ newChar.toChar)
      }
    }
    encoderRec(context, List.empty)
  }

}
