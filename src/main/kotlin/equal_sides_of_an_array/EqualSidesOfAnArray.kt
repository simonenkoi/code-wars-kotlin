package equal_sides_of_an_array

object EqualSidesOfAnArray {

    fun findEvenIndex(arr: IntArray): Int = arr.indices.indexOfFirst { arr.take(it).sum() == arr.drop(it + 1).sum() }
}