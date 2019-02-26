/**
 * This is a series of Kotlin tricks.
 *
 * We have (preloaded):
 *
 * data class Box(var x: Int, var y: Int, var width: Int, var height: Int) {
 *     fun area() = width * height
 *     fun rightDown() = width + x to height + y
 *     fun rightUp() = width + x to height
 *     fun leftDown() = width to (height + y)
 * }
 * We want to do something (you can do anything) that allow you to do the job shown below:
 *
 * val box = Box(...)
 * box {
 *     println(area()) // box.area()
 *     println(width)
 *     width += 1 // box.width is increased by 1
 *     println(width)
 * }
 */
package go_into_a_class;