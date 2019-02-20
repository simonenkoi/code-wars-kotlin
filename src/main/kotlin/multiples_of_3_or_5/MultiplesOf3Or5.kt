package multiples_of_3_or_5

fun solution(number: Int): Int {
    return (1 until number)
        .filter { it % 3 == 0 || it % 5 == 0}
        .sum()
}