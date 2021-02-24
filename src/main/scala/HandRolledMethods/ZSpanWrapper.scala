package HandRolledMethods

import scala.annotation.tailrec

class ZSpanWrapper[A](targetList: List[A]) {

  def zspan(givenFunc: A => Boolean): (List[A], List[A]) = {
    @tailrec
    def spanRec(firstHalf: List[A], secondHalf: List[A]): (List[A], List[A]) = {
      secondHalf match {
        case Nil => (firstHalf, targetList)
        case x :: xs =>
          if (givenFunc(x)) {
            val newFirstHalf = firstHalf :+ x
            (newFirstHalf, targetList.filter(_ != x))
          } else {
            spanRec(firstHalf, xs)
          }
      }
    }
    spanRec(List.empty, targetList)
  }

}
