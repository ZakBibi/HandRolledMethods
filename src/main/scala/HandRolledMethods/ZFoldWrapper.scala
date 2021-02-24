package HandRolledMethods

import scala.annotation.tailrec

class ZFoldWrapper[A](targetList: List[A]) {

  def zfold(seed: A)(f: (A, A) => A): A = {
    if (targetList.isEmpty) {
      seed
    } else {
      @tailrec
      def foldRec(collection: List[A], result: A): A = {
        collection match {
          case Nil => result
          case x :: xs =>
            val newResult = f(result, x)
            foldRec(xs, newResult)
        }
      }
      val firstResult = f(seed, targetList.head)
      foldRec(targetList.tail, firstResult)
    }
  }

}
