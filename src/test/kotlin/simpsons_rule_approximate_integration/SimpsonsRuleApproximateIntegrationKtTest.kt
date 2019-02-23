package simpsons_rule_approximate_integration

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.text.DecimalFormat

internal class SimpsonsRuleApproximateIntegrationKtTest {
    @Test
    fun test1() {
        println("Fixed Tests: simpson")
        assertFuzzyEquals(simpson(290), 1.9999999986)
        assertFuzzyEquals(simpson(72), 1.9999996367)

    }

    companion object {
        private fun assertFuzzyEquals(act: Double, exp: Double) {
            val inrange = Math.abs(act - exp) <= 1e-10
            if (!inrange) {
                val df = DecimalFormat("#.0000000000")
                println("At 1e-10: Expected must be " + df.format(exp) + ", but got " + df.format(act))
            }
            assertEquals(true, inrange)
        }
    }
}