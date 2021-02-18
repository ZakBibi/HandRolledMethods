package HandRolledMethods

import scala.annotation.tailrec

class ZMap {

  def handRolledIntMap(l: List[Int], f: Int => Int): List[Int] = {
    if (l.isEmpty) List.empty
    else {
      @tailrec
      def mapRec(nums: List[Int], newNums: List[Int]): List[Int] = {
        nums match {
          case Nil => newNums
          case x :: xs =>
            val manipulatedNums = newNums :+ f(x)
            mapRec(xs, manipulatedNums)
        }
      }
      mapRec(l, List.empty)
    }
  }

}
