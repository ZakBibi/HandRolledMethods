package ListMethods

import scala.annotation.tailrec

class ZForEach {

  def handRolledForEach(l: List[Int], f: Int => Unit): Unit = {
    if (l.isEmpty) Unit
    else {
      @tailrec
      def foreachRec(nums: List[Int], fun: Int => Unit): Unit = {
        nums match {
          case Nil => Unit
          case x :: xs =>
            fun(x)
            foreachRec(xs, fun)
        }
      }
      foreachRec(l, f)
    }
  }

}
