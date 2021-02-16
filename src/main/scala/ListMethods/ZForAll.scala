package ListMethods

import scala.annotation.tailrec

class ZForAll {

  def handRolledForAll(l: List[Int], f: Int => Boolean): Boolean = {
    if (l.isEmpty) {
      false
    } else {
      @tailrec
      def forallRec(nums: List[Int], currentBool: Boolean): Boolean = {
        nums match {
          case Nil => currentBool
          case x :: xs =>
            if (f(x)) {
              forallRec(xs, currentBool = true)
            } else {
              forallRec(xs, currentBool = false)
            }
        }
      }
      forallRec(l, currentBool = false)
    }
  }

}
