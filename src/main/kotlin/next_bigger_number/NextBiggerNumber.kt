package next_bigger_number

import java.util.Arrays

fun nextBiggerNumber(n: Long): Long {
    val text: MutableList<Char> = n.toString().toMutableList()
    for (i in text.size - 2 downTo 0) {
        if (text[i] < text[i + 1]) {
            val tail: MutableList<Char> = text.subList(i + 1, text.size)
            val min: IndexedValue<Char> = tail.withIndex().filter { it.value > text[i] }.minBy { it.value }!!
            text[i + 1 + min.index] = text[i]
            text[i] = min.value
            tail.sort()
            return text.joinToString("").toLong()
        }
    }
    return -1
}