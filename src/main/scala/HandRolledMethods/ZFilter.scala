package HandRolledMethods

import scala.annotation.tailrec

class ZFilter {

  def handRolledFilter(l: List[Int], f: Int => Boolean): List[Int] = {
    if (l.isEmpty) List.empty
    else {
      @tailrec
      def filterRec(nums: List[Int], newNums: List[Int]): List[Int] = {
        nums match {
          case Nil => newNums
          case x :: xs =>
            if (f(x)) {
              val isF = newNums :+ x
              filterRec(xs, isF)
            } else {
              filterRec(xs, newNums)
            }
        }
      }
      filterRec(l, List.empty)
    }
  }

}
