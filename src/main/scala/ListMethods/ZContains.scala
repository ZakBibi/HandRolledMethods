package ListMethods

import scala.annotation.tailrec

class ZContains {

  def handRolledContains(l: List[Int], e: Int): Boolean = {
    if (l.isEmpty) false
    else {
      @tailrec
      def containsRec(nums: List[Int]): Boolean = {
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