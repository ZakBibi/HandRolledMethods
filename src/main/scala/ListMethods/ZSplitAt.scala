package ListMethods

import scala.annotation.tailrec

class ZSplitAt {

  def handRolledSplitAt(l: List[Int], givenIndex: Int): (List[Int], List[Int]) = {
    @tailrec
    def splitAtRec(l: List[Int], firstHalf: List[Int], secondHalf: List[Int], count: Int): (List[Int], List[Int]) = {
      l match {
        case Nil => (List.empty, List.empty)
        case x :: xs =>
          if (count < givenIndex) {
            val newFirstHalf = firstHalf :+ x
            splitAtRec(xs, newFirstHalf, xs, count + 1)
          } else {
            (firstHalf, secondHalf)
          }
      }
    }
    splitAtRec(l, List.empty, List.empty, 0)
  }

}
