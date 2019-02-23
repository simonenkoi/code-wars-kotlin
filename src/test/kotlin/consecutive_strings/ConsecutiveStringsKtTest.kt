package consecutive_strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ConsecutiveStringsKtTest {
    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(
            longestConsec(
                arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"),
                2
            ), "abigailtheta"
        )
        testing(
            longestConsec(
                arrayOf<String>(
                    "ejjjjmmtthh",
                    "zxxuueeg",
                    "aanlljrrrxx",
                    "dqqqaaabbb",
                    "oocccffuucccjjjkkkjyyyeehh"
                ), 1
            ), "oocccffuucccjjjkkkjyyyeehh"
        )

    }

    companion object {
        private fun testing(actual: String, expected: String) {
            assertEquals(expected, actual)
        }
    }
}
