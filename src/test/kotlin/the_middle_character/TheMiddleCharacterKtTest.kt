package the_middle_character

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TheMiddleCharacterKtTest {
    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"))
        assertEquals("dd", getMiddle("middle"))
        assertEquals("t", getMiddle("testing"))
        assertEquals("A", getMiddle("A"))
    }
}