package throw_without_throwing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.nio.BufferOverflowException
import java.util.*
import kotlin.NoSuchElementException

internal class ThrowWithoutThrowingKtTest {
    class ThrowWithoutThrowingTest {
        @Test
        fun tests() {
            assertThrows(ArithmeticException::class.java) { arithmetic() }
            assertThrows(NoSuchElementException::class.java) { noSuchElement() }
            assertThrows(ArrayIndexOutOfBoundsException::class.java) { arrayIndexOutOfBound() }
            assertThrows(ClassCastException::class.java) { classCast() }
            assertThrows(StackOverflowError::class.java) { stackOverflow() }
            assertThrows(NullPointerException::class.java) { nullPointer() }
            assertThrows(NumberFormatException::class.java) { numberFormat() }
            assertThrows(IllegalArgumentException::class.java) { illegalArgument() }
            assertThrows(NegativeArraySizeException::class.java) { negativeArraySize() }
            assertThrows(EmptyStackException::class.java) { emptyStack() }
            assertThrows(BufferOverflowException::class.java) { bufferOverflow() }
            assertThrows(ArrayStoreException::class.java) { arrayStore() }
            assertThrows(UnsupportedOperationException::class.java) { unsupportedOperation() }
            assertThrows(IllegalStateException::class.java) { illegalState() }
        }
    }
}