package multiples_of_3_or_5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MultiplesOf3Or5KtTest {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}