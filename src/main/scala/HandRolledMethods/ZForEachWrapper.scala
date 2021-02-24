package HandRolledMethods

import scala.annotation.tailrec

class ZForEachWrapper[A](targetList: List[A]) {

  def zforeach(f: A => Unit): Unit = {
    if (targetList.isEmpty) Unit
    else {
      @tailrec
      def foreachRec(collection: List[A]): Unit = {
        collection match {
          case Nil => Unit
          case x :: xs =>
            f(x)
            foreachRec(xs)
        }
      }
      foreachRec(targetList)
    }
  }

}
