package go_into_a_class

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class GoIntoAClassKtTest {
    @Test
    fun testBox() {
        val rand = Random(System.currentTimeMillis())
        val xx = rand.nextInt(100)
        val yy = rand.nextInt(100)
        val box = Box(xx, yy, xx + rand.nextInt(1000), yy + rand.nextInt(1000))
        val testerBox = box.copy()
        fun boxEquals(testerBox: Box, box: Box) {
            assertEquals(testerBox, box)
            assertEquals(testerBox.area(), box.area())
            assertEquals(testerBox.leftDown(), box.leftDown())
            assertEquals(testerBox.rightDown(), box.rightDown())
            assertEquals(testerBox.rightUp(), box.rightUp())
        }
        box {
            var r = rand.nextInt(10)
            boxEquals(testerBox, box)
            x -= r
            testerBox.x -= r
            boxEquals(testerBox, box)
            r = rand.nextInt(10)
            y -= r
            testerBox.y -= r
            boxEquals(testerBox, box)
            r = rand.nextInt(10)
            width += r
            testerBox.width += r
            boxEquals(testerBox, box)
            r = rand.nextInt(10)
            height += r
            testerBox.height += r
            boxEquals(testerBox, box)
        }
    }
}