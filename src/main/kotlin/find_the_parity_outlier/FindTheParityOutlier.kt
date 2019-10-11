package find_the_parity_outlier

fun find(integers: Array<Int>): Int {
    return integers.groupBy { it % 2 == 0 }.minBy { it.value.size }!!.value[0]
}