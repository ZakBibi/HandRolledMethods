package ListMethods

import scala.annotation.tailrec

class ZPartition {

  def handRolledPartition(l: List[Int], givenFunc: Int => Boolean): (List[Int], List[Int]) = {
    if (l.isEmpty) {
      (List.empty, List.empty)
    } else {
      @tailrec
      def partitionRec(l: List[Int], firstHalf: List[Int], secondHalf: List[Int]): (List[Int], List[Int]) = {
        l match {
          case Nil => (firstHalf, secondHalf)
          case x :: xs =>
            if (givenFunc(x)) {
              val newFirstHalf = firstHalf :+ x
              partitionRec(xs, newFirstHalf, secondHalf)
            } else {
              val newSecondHalf = secondHalf :+ x
              partitionRec(xs, firstHalf, newSecondHalf)
            }
        }
      }

      partitionRec(l, List.empty, List.empty)
    }
  }

}
