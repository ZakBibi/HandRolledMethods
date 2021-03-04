package MidsummerNightsDream

class WordLength {

  def countGreaterThanLength(play: List[String], lengthLimit: Int): Int = {
    play
      .toString
      .split(" ")
      .toList
      .map { c =>
        c.stripSuffix(",")
          .stripSuffix(".")
          .stripSuffix(";")
          .stripSuffix(":")
          .stripSuffix("!")
          .stripSuffix("?")
      }
      .filter(e => e != "" && e != ",").count(s => s.length >= lengthLimit)
  }

  def countLessThanLength(play: List[String], lengthLimit: Int): Int = {
    play
      .toString
      .split(" ")
      .toList
      .map { c =>
        c.stripSuffix(",")
          .stripSuffix(".")
          .stripSuffix(";")
          .stripSuffix(":")
          .stripSuffix("!")
          .stripSuffix("?")
      }
      .filter(e => e != "" && e != ",").count(s => s.length <= lengthLimit)
  }

}
