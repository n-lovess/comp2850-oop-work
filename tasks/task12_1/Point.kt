import kotlin.math.hypot

class Point(var x: Double, var y: Double) {

    fun distance() = hypot(x, y)

    fun distanceTo(other: Point) = hypot(x - other.x, y - other.y)
}

fun main() {
    print("Enter x coordinate: ")
    val xInput = readLine()!!.toDouble()

    print("Enter y coordinate: ")
    val yInput = readLine()!!.toDouble()

    val p = Point(xInput, yInput)

    println("Distance from origin: ${p.distance()}")

    val q = Point(4.5, 7.0)
    println("Distance from (4.5, 7.0): ${p.distanceTo(q)}")
}
