package throw_without_throwing

import java.nio.ByteBuffer
import java.util.*
import kotlin.collections.ArrayList


fun arrayIndexOutOfBound() {
    arrayOf<Any>()[0]
}

fun negativeArraySize() {
    Array(-1) { Any() }
}

fun noSuchElement() {
    listOf<Any>().iterator().next()
}

fun arithmetic() {
    0 / 0
}

fun classCast() {
    Any() as String
}

fun stackOverflow() {
    stackOverflow()
}

fun nullPointer() {
    null!!
}

fun numberFormat() {
    "string".toLong()
}

fun illegalArgument() {
    ArrayList<Any>(-1)
}

fun emptyStack() {
    Stack<Any>().peek()
}

fun bufferOverflow() {
    ByteBuffer.allocateDirect(0).put(byteArrayOf(1))
}

fun arrayStore() {
    (arrayOf("Hello") as Array<Any>)[0] = 1

}

fun unsupportedOperation() {
    Arrays.asList<Any>().add(Unit)
}

fun illegalState() {
    mutableListOf<Any>().iterator().remove()
}


