package rectangle_into_squares

fun sqInRect(lng:Int, wdth:Int):List<Int>? {
    if (lng == wdth) {
        return null
    }
    var length = lng
    var width = wdth
    val result = ArrayList<Int>()
    while (length > 1 && width > 1) {
        if (length > width) {
            result.add(width)
            length -= width
        } else {
            result.add(length)
            width -= length
        }
    }
    return result
}