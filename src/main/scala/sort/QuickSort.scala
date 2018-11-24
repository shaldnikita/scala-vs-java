package sort

/**
  * @author n.shaldenkov on 24.11.2018
  */
object QuickSort extends App {

  private val array = Array(6, 7, 1, 2, 3, 123, -1)

  new FunctionalQuickSort().sort(array)
  new JustQuicksort().doQuickSort(array)

}
