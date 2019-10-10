package alphabet_war

fun alphabetWar(fight: String): String {
    val sum: Int = fight.replace(Regex("""\w?\*\w?"""), "")
        .sumBy {
            when (it) {
                in "sbpw" -> "sbpw".indexOf(it) + 1
                in "zdqm" -> -("zdqm".indexOf(it) + 1)
                else -> 0
            }
        }
    return when {
        sum < 0 -> "Right side wins!"
        sum > 0 -> "Left side wins!"
        else -> "Let's fight again!"
    }
}