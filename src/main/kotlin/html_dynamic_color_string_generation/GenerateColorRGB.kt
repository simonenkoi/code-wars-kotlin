package html_dynamic_color_string_generation

import java.util.*

object GenerateColorRGB {
    fun generateColor(r: Random): String = Integer.toHexString(r.nextInt(256 * 256 * 256)).padStart(6, '0')
}