package HandRolledMethods

import scala.annotation.tailrec

class ZFindWrapper[A](targetList: List[A]) {

  def zfind(f: A => Boolean): Option[A] = {
    if (targetList.isEmpty) None
    else {
      @tailrec
      def findRec(collection: List[A]): Option[A] = {
        collection match {
          case Nil => None
          case x :: xs =>
            if (f(x)) {
              Some(x)
            } else {
              findRec(xs)
            }
        }
      }
      findRec(targetList)
    }
  }

}