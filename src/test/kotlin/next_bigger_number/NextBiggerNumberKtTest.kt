package next_bigger_number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NextBiggerNumberKtTest {

    @Test
    fun basicTests() {
        assertEquals(21, nextBiggerNumber(12))
        assertEquals(531, nextBiggerNumber(513))
        assertEquals(2071, nextBiggerNumber(2017))
        assertEquals(441, nextBiggerNumber(414))
        assertEquals(414, nextBiggerNumber(144))
    }
}