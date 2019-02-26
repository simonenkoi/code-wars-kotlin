package define_a_function

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File
import java.io.IOException
import java.nio.file.Files
import kotlin.random.Random

internal class DefineAFunctionKtTest {

    @Test
    fun fixedTest() {
        assertEquals("ice1000", concatString("ice", "1000"))
    }

    @Test
    fun randomTest() {
        val r = Random(System.currentTimeMillis())
        (0..100).forEach {
            val a = r.nextInt().toString(2)
            val b = r.nextInt().toString(2)
            assertEquals(a + b, concatString(a, b))
        }
    }
}
