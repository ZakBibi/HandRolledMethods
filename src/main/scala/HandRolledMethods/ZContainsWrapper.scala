package HandRolledMethods

import scala.annotation.tailrec

class ZContainsWrapper[A](targetList: List[A]) {

  def zcontains(element: A): Boolean = {
    if (targetList.isEmpty) false
    else {
      @tailrec
      def containsRec(collection: List[A]): Boolean = {
        collection match {
          case Nil => false
          case x :: xs =>
            if (x == element) {
              true
            } else {
              containsRec(xs)
            }
        }
      }
      containsRec(targetList)
    }
  }

}