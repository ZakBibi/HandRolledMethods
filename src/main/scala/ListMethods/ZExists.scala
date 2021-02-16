package ListMethods

import scala.annotation.tailrec

class ZExists {

  def handRolledExists(l: List[Int], f: Int => Boolean): Boolean = {
    if (l.isEmpty) false
    else {
      @tailrec
      def existsRec(nums: List[Int]): Boolean = {
        nums match {
          case Nil => false
          case x :: xs =>
            if (f(x)) {
              true
            } else {
              existsRec(xs)
            }
        }
      }
      existsRec(l)
    }
  }

}
