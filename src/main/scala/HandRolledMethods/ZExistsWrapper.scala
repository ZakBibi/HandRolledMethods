package HandRolledMethods

import scala.annotation.tailrec

class ZExistsWrapper[A](targetList: List[A]) {

  def zexists(f: A => Boolean): Boolean = {
    if (targetList.isEmpty) false
    else {
      @tailrec
      def existsRec(collection: List[A]): Boolean = {
        collection match {
          case Nil => false
          case x :: xs =>
            if (f(x)) {
              true
            } else {
              existsRec(xs)
            }
        }
      }
      existsRec(targetList)
    }
  }

}
