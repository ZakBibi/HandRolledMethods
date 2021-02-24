package HandRolledMethods

import scala.annotation.tailrec

class ZForAllWrapper[A](targetList: List[A]) {

  def zforall(f: A => Boolean): Boolean = {
    if (targetList.isEmpty) {
      false
    } else {
      @tailrec
      def forallRec(collection: List[A], currentBool: Boolean): Boolean = {
        collection match {
          case Nil => currentBool
          case x :: xs =>
            if (f(x)) {
              forallRec(xs, currentBool = true)
            } else {
              forallRec(xs, currentBool = false)
            }
        }
      }
      forallRec(targetList, currentBool = false)
    }
  }

}
