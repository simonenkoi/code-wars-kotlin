package persistent_bugger

fun persistence(num: Int): Int {
    val chars = num.toString().toCharArray()
    val multiplied = chars.fold(1) { acc, c -> Character.getNumericValue(c).times(acc) }
    return if (chars.size != 1) persistence(multiplied) + 1 else 0
}