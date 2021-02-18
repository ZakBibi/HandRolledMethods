package HandRolledMethods

import scala.annotation.tailrec

class ZContains {

  def handRolledContains(l: List[Any], e: Any): Boolean = {
    if (l.isEmpty) false
    else {
      @tailrec
      def containsRec(nums: List[Any]): Boolean = {
        nums match {
          case Nil => false
          case x :: xs =>
            if (x == e) {
              true
            } else {
              containsRec(xs)
            }
        }
      }
      containsRec(l)
    }
  }

}