package counting_duplicates

fun duplicateCount(text: String): Int {
    return text.toLowerCase()
        .groupingBy { it }
        .eachCount()
        .values.count { it > 1 }
}