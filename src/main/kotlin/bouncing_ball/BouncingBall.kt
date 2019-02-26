package bouncing_ball

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
        return -1
    }
    return generateSequence(h) { it * bounce }
        .takeWhile { it > window }
        .count() * 2 - 1
}