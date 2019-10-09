package the_middle_character

import kotlin.math.ceil
import kotlin.math.floor

fun getMiddle(word: String): String {
    val middlePointer: Double = word.length.toDouble() / 2
    return word.substring(ceil(middlePointer).toInt() - 1, floor(middlePointer).toInt() + 1)
}