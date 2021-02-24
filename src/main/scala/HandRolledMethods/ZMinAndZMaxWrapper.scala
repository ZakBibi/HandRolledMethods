package HandRolledMethods

import scala.annotation.tailrec

class ZMinAndZMaxWrapper[A](targetList: List[A]) {

  def zmin(implicit ord: Ordering[A]): A = {
    if (targetList.isEmpty)
      throw new UnsupportedOperationException("empty.min")
    else {
      @tailrec
      def recMin(l: List[A], currentMin: A): A = {
        l match {
          case Nil => currentMin
          case x :: xs =>
            if (ord.lt(x, currentMin)) {
              recMin(xs, x)
            } else {
              recMin(xs, currentMin)
            }
        }
      }
      recMin(targetList, targetList.head)
    }
  }

  def zmax(implicit ord: Ordering[A]): A = {
    if (targetList.isEmpty)
      throw new UnsupportedOperationException("empty.max")
    else {
      @tailrec
      def recMax(l: List[A], currentMax: A): A = {
        l match {
          case Nil => currentMax
          case x :: xs =>
            if (ord.gt(x, currentMax)) {
              recMax(xs, x)
            } else {
              recMax(xs, currentMax)
            }
        }
      }
      recMax(targetList, targetList.head)
    }
  }

}
