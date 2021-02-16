package ListMethods

import scala.annotation.tailrec

class ZDeepFlatten {

  def handRolledFlatten(l: List[Any]): List[Any] = {
    @tailrec
    def flattenRec(remaining: List[Any], res: List[Any]): List[Any] = {
      remaining match {
        case Nil => res
        case (a: List[_]) :: Nil => flattenRec(a, res)
        case (a:List[_]) :: tail => flattenRec(tail, res ::: handRolledFlatten(a))
        case a :: tail => flattenRec(tail, res :+ a)
      }
    }
    flattenRec(l, List.empty)
  }

}
