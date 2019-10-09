package shortest_word

fun findShort(s: String): Int = s.split(" ").map { it.length }.min() ?: 0