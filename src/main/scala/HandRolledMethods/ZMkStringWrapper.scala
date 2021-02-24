package HandRolledMethods

import scala.annotation.tailrec

class ZMkStringWrapper[A](targetList: List[A]) {

  def zmkString(delimiter: String): String = {
    @tailrec
    def mkStringRec(collection: List[A], madeString: String): String = {
      collection match {
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
    mkStringRec(targetList, "")
  }

}
