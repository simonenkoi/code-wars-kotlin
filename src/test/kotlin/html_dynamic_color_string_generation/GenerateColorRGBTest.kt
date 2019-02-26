package html_dynamic_color_string_generation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

internal class GenerateColorRGBTest {
    @Test
    @Throws(Exception::class)
    fun symbolTest() {
        assertEquals("#", GenerateColorRGB.generateColor(Random()).substring(0, 1))
    }
}