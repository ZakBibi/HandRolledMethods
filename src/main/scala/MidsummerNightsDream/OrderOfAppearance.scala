package MidsummerNightsDream

import scala.collection.mutable

class OrderOfAppearance extends IsCase {

  def findDramatisPersonae(play: List[String]): List[String] = {
    val indexOfDramatisPersonaeLine = play.indexOf("Dramatis Personae")
    val indexOfAttendantsLine = play.indexOf("Attendants on Theseus and Hippolyta")
    val c = play
      .slice(indexOfDramatisPersonaeLine, indexOfAttendantsLine)
      .toString
      .split(" ")
      .toSet
      .filter(e => isCaps(e))
    val characters = c
      .map(e => e.stripSuffix(","))
      .filter(e => e != "GOODFELLOW" && e !="ROBIN" && e != "")
    characters.toList
  }

  def orderOfAppearance(play: List[String], dramatisPersonae: List[String]): mutable.LinkedHashSet[String] = {
    val characters = play
      .filter(x => isCaps(x))
      .filter(_ != "")
      .map(e => e.stripSuffix("."))
      .filter(x => dramatisPersonae.contains(x))

    var uniqueChars = mutable.LinkedHashSet[String]()

    for (c <- characters)
      uniqueChars += c

    uniqueChars
  }

}
