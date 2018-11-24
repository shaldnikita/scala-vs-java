package sort

/**
  * @author n.shaldenkov on 24.11.2018
  *
  */
class JustQuicksort {
  def doQuickSort(array: Array[Int]): Unit = {
    def swap(i: Int, j: Int) {
      val t = array(i)
      array(i) = array(j)
      array(j) = t
    }

    def doSort(start: Int, end: Int): Unit = {
      val middle = array((start + end) / 2)
      var i = start
      var j = end
      while (i <= j) {
        while (array(i) < middle) i += 1
        while (array(j) > middle) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (start < j)
        doSort(start, j)
      if (j < end)
        doSort(i, end)
    }

    doSort(0, array.length - 1)
    array.foreach(println(_))
  }
}
