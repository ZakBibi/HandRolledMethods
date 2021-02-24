package HandRolledMethods

class ZIsEmptyWrapper[A](targetList: List[A]) {

  def zisEmpty: Boolean = {
    targetList.length < 1
  }

}
