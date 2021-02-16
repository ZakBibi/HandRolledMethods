package ListMethods

import scala.annotation.tailrec

class ZMinAndZMax {

  def handRolledMin(l: List[Int]): Int = {
    if (l.isEmpty) 0
    else {
      @tailrec
      def recMin(l: List[Int], currentMin: Int): Int = {
        l match {
          case Nil => currentMin
          case x :: xs =>
            if (x < currentMin) {
              recMin(xs, x)
            } else {
              recMin(xs, currentMin)
            }
        }
      }
      recMin(l, 1)
    }
  }

  def handRolledMax(l: List[Int]): Int = {
    if (l.isEmpty) 0
    else {
      @tailrec
      def recMax(l: List[Int], currentMax: Int): Int = {
        l match {
          case Nil => currentMax
          case x :: xs =>
            if (x > currentMax) {
              recMax(xs, x)
            } else {
              recMax(xs, currentMax)
            }
        }
      }
      recMax(l, 0)
    }
  }

}
