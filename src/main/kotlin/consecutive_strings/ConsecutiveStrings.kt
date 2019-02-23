package consecutive_strings

fun longestConsec(strarr: Array<String>, k: Int): String {
    if (strarr.isEmpty() || k > strarr.size || k <= 0) {
        return ""
    }
    return strarr.toList()
        .windowed(size = k)
        .map { it.joinToString("") }
        .maxBy { it.length } ?: ""
}