package HandRolledMethods

import scala.annotation.tailrec

class ZMapWrapper[A](targetList: List[A]) {

  def zmap(f: A => A): List[A] = {
    if (targetList.isEmpty) List.empty
    else {
      @tailrec
      def mapRec(collection: List[A], newCollection: List[A]): List[A] = {
        collection match {
          case Nil => newCollection
          case x :: xs =>
            val manipulatedCollection = newCollection :+ f(x)
            mapRec(xs, manipulatedCollection)
        }
      }
      mapRec(targetList, List.empty)
    }
  }

}
