package go_into_a_class

data class Box(var x: Int, var y: Int, var width: Int, var height: Int) {
    fun area() = width * height
    fun rightDown() = width + x to height + y
    fun rightUp() = width + x to height
    fun leftDown() = width to (height + y)
}