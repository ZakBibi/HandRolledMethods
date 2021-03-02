package MidsummerNightsDream

import HandRolledMethods.ZFilterWrapper

import scala.annotation.tailrec
import scala.collection.mutable

class OrderOfAppearance {

  def isCaps(s: String): Boolean = {
    s.toUpperCase == s
  }

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

//  def orderOfAppearance(play: List[String], dramatisPersonae: List[String]): List[String] = {
//    def orderOfAppearanceRec(dramatisPersonae: List[String], )
//  }

}
