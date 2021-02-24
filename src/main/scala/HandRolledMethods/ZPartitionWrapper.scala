package HandRolledMethods

import scala.annotation.tailrec

class ZPartitionWrapper[A](targetList: List[A]) {

  def zpartition(givenFunc: A => Boolean): (List[A], List[A]) = {
    if (targetList.isEmpty) {
      (List.empty, List.empty)
    } else {
      @tailrec
      def partitionRec(l: List[A], firstHalf: List[A], secondHalf: List[A]): (List[A], List[A]) = {
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
      partitionRec(targetList, List.empty, List.empty)
    }
  }

}
