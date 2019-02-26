package do_multiple_replacement

fun f(s: String): String = s.map { "()<>{}".zip(")(><}{").toMap()[it] ?: it }.joinToString("")