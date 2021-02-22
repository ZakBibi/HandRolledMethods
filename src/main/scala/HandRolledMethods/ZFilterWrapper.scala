package HandRolledMethods

import scala.annotation.tailrec

class ZFilterWrapper[A](targetList: List[A]) {

  def zfilter(f: A => Boolean): List[A] = {
    if (targetList.isEmpty) List.empty
    else {
      @tailrec
      def filterRec(collection: List[A], newCollection: List[A]): List[A] = {
        collection match {
          case Nil => newCollection
          case x :: xs =>
            if (f(x)) {
              val isF = newCollection :+ x
              filterRec(xs, isF)
            } else {
              filterRec(xs, newCollection)
            }
        }
      }
      filterRec(targetList, List.empty)
    }
  }

}
