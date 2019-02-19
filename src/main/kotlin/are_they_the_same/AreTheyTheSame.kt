package are_they_the_same

fun comp(a: IntArray?, b: IntArray?): Boolean = a != null && b != null && a.map { it * it }.sorted() == b.sorted()