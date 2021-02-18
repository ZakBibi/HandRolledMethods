package HandRolledMethods

import scala.annotation.tailrec

class ZCount {

  def handRolledCount(l: List[Int], f: Int => Boolean): Int = {
    if (l.isEmpty) 0
    else {
      @tailrec
      def countRec(collectionOfNum: List[Int], currentCount: Int): Int = {
        collectionOfNum match {
          case Nil => currentCount
          case x :: xs =>
            if (f(x)) {
              val newCurrentCount = currentCount + 1
              countRec(xs, newCurrentCount)
            } else {
              countRec(xs, currentCount)
            }
        }
      }
      countRec(l, 0)
    }
  }

}
