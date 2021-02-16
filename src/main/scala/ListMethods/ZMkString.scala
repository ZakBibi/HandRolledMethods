package ListMethods

import scala.annotation.tailrec

class ZMkString {

  def handRolledMkString(l: List[Int], delimiter: String): String = {
    @tailrec
    def mkStringRec(nums: List[Int], madeString: String): String = {
      nums match {
        case Nil => madeString
        case x :: xs =>
          if (madeString == "") {
            val firstNewString = x.toString
            mkStringRec(xs, firstNewString)
          } else {
            val newString = madeString + delimiter + x.toString
            mkStringRec(xs, newString)
          }
      }
    }
    mkStringRec(l, "")
  }

}
