package do_multiple_replacement

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DoMultipleReplacementKtTest {
    @Test
    fun exampleTests() {
        assertEquals("You {{need}} <extra> time ( or money )", f("You }}need{{ >extra< time ) or money ("))
        assertEquals("<br/>", f(">br/<"))
    }
}