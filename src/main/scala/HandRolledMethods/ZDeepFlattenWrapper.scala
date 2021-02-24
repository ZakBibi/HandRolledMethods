package HandRolledMethods

import scala.annotation.tailrec

class ZDeepFlattenWrapper[A](targetList: List[A]) {

  def zflatten: List[A] = {
    @tailrec
    def flattenRec(remaining: List[A], res: List[A]): List[A] = {
      remaining match {
        case Nil => res
        case (a: List[A]) :: Nil => flattenRec(a, res)
        case (a: List[A]) :: tail => flattenRec(tail, res ::: zflatten)
        case a :: tail => flattenRec(tail, res :+ a)
      }
    }
    flattenRec(targetList, List.empty)
  }

}
