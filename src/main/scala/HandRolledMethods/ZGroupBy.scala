package HandRolledMethods

import scala.annotation.tailrec

class ZGroupBy {

  def handRolledGroupBy(l: List[(Int, String)]): Map[Int, List[String]] = {
    @tailrec
    def groupByRec(t: List[(Int, String)], currentMap: Map[Int, List[String]]): Map[Int, List[String]] = {
      t match {
        case Nil => currentMap
        case x :: xs =>
          if (currentMap.contains(x._1)) {
            val newList: List[String] = currentMap(x._1) :+ x._2
            val updatedMap = currentMap + (x._1 -> newList)
            groupByRec(xs, updatedMap)
          } else {
            val updatedMap = currentMap + (x._1 -> List(x._2))
            groupByRec(t.tail, updatedMap)
          }
      }
    }
    groupByRec(l, Map.empty)
  }

}
