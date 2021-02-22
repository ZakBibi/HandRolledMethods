package HandRolledMethods

import scala.annotation.tailrec

class ZCountWrapper[A](targetList: List[A]) {

  def zcount(f: A => Boolean): Int = {
    if (targetList.isEmpty) 0
    else {
      @tailrec
      def countRec(collection: List[A], currentCount: Int): Int = {
        collection match {
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
      countRec(targetList, 0)
    }
  }

}
