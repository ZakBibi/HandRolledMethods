package MidsummerNightsDream

class CountWordsWith {

  def countWordsWith(play: List[String], givenValue: String): Int = {
    play
      .toString
      .split(" ")
      .toList
      .filter(e => e != "").count(s => s.contains(givenValue))
  }

}
