package HandRolledMethods

import scala.annotation.tailrec

class ZSplitAtWrapper[A](targetList: List[A]) {

  def zsplitAt(givenIndex: Int): (List[A], List[A]) = {
    @tailrec
    def splitAtRec(l: List[A], firstHalf: List[A], secondHalf: List[A], count: Int): (List[A], List[A]) = {
      l match {
        case Nil => (firstHalf, secondHalf)
        case x :: xs =>
          if (count < givenIndex) {
            val newFirstHalf = firstHalf :+ x
            splitAtRec(xs, newFirstHalf, xs, count + 1)
          } else {
            (firstHalf, secondHalf)
          }
      }
    }
    splitAtRec(targetList, List.empty, List.empty, 0)
  }

}
