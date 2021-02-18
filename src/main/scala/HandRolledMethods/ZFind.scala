package HandRolledMethods

import scala.annotation.tailrec

class ZFind {

  def handRolledFind(l: List[Int], f: Int => Boolean): Option[Int] = {
    if (l.isEmpty) None
    else {
      @tailrec
      def findRec(nums: List[Int]): Option[Int] = {
        nums match {
          case Nil => None
          case x :: xs =>
            if (f(x)) {
              Some(x)
            } else {
              findRec(xs)
            }
        }
      }
      findRec(l)
    }
  }

}