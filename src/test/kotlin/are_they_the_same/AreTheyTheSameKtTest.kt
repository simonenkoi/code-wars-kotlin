package are_they_the_same

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AreTheyTheSameKtTest {

    @Test
    fun testFixed() {
        val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val a2 = intArrayOf(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)

        assertEquals(true, comp(a1, a2))
    }
}