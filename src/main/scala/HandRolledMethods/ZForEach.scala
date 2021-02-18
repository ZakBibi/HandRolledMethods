package HandRolledMethods

import scala.annotation.tailrec

class ZForEach {

  def handRolledForEach(l: List[Any], f: Any => Unit): Unit = {
    if (l.isEmpty) Unit
    else {
      @tailrec
      def foreachRec(collection: List[Any]): Unit = {
        collection match {
          case Nil => Unit
          case x :: xs =>
            f(x)
            foreachRec(xs)
        }
      }
      foreachRec(l)
    }
  }

}
