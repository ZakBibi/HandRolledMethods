package HandRolledMethods

import scala.annotation.tailrec

class ZSum {

  def handRolledSum(l: List[Int]): Int = {
    if (l.isEmpty) 0
    else {
      @tailrec
      def sumRec(nums: List[Int], currentSum: Int): Int = {
        nums match {
          case Nil => currentSum
          case x :: xs =>
            val newCurrentSum = currentSum + x
            sumRec(xs, newCurrentSum)
        }
      }
      sumRec(l, 0)
    }
  }

}
