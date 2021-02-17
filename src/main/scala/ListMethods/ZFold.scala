package ListMethods

import scala.annotation.tailrec

class ZFold {

  def handRolledFold(l: List[Int], seed: Int)(f: (Int, Int) => Int): Int = {
    if (l.isEmpty) {
      seed
    } else {
      @tailrec
      def foldRec(nums: List[Int], result: Int): Int = {
        nums match {
          case Nil => result
          case x :: xs =>
            val newResult = f(result, x)
            foldRec(xs, newResult)
        }
      }

      val firstResult = f(seed, l.head)
      foldRec(l.tail, firstResult)
    }
  }

}
