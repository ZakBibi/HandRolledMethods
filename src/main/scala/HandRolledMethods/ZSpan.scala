package HandRolledMethods

import scala.annotation.tailrec

class ZSpan {

  def handRolledSpan(l: List[Int], givenFunc: Int => Boolean): (List[Int], List[Int]) = {
    @tailrec
    def spanRec(l: List[Int], firstHalf: List[Int], secondHalf: List[Int]): (List[Int], List[Int]) = {
      l match {
        case Nil => (List.empty, List.empty)
        case x :: xs =>
          if (givenFunc(x)) {
            val newFirstHalf = firstHalf :+ x
            spanRec(xs, newFirstHalf, xs)
          } else {
            (firstHalf, secondHalf)
          }
      }
    }
    spanRec(l, List.empty, List.empty)
  }

}
