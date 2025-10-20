// Task 12.4.1: Circle class
class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) { "Radius must be greater than zero" }
    }

    fun area(): Double = Math.PI * radius * radius

    fun perimeter(): Double = 2 * Math.PI * radius

    fun contains(p: Point): Boolean {
        val dx = p.x - centre.x
        val dy = p.y - centre.y
        val distance = Math.sqrt(dx * dx + dy * dy)
        return distance <= radius
    }
}

fun main() {
    val c = Circle(Point(0.0, 0.0), 5.0)
    println("Area: ${c.area()}")
    println("Perimeter: ${c.perimeter()}")
    println("Contains (3,4): ${c.contains(Point(3.0, 4.0))}")
    println("Contains (6,0): ${c.contains(Point(6.0, 0.0))}")
}