package sort

/**
  * @author n.shaldenkov on 24.11.2018
  *
  */
class FunctionalQuickSort {

  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <)))
    }
  }
}
