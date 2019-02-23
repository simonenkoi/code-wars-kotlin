package simpsons_rule_approximate_integration

import kotlin.math.PI
import kotlin.math.sin

const val a = 0.0
const val b = PI

fun h(n: Int): Double = (a - b) / n
fun f(x: Double): Double = (3.0 / 2.0) * Math.pow(sin(x), 3.0)

fun s1(n: Int): Double {
    return (1..n / 2)
        .map { f(a + (2 * it - 1) * h(n)) }
        .sum()
}

fun s2(n: Int): Double {
    return (1 until n / 2)
        .map { f(a + 2 * it * h(n)) }
        .sum()
}

fun simpson(n: Int): Double {
    return (b - a) / (3 * n) * (f(a) + f(b) + 4 * s1(n) + 2 * s2(n))
}
