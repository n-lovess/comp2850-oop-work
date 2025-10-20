// Task 12.4.1: main program

fun main() {
    val circle = Circle(Point(0.0, 0.0), 5.0)

    println("Circle area: ${circle.area()}")
    println("Circle perimeter: ${circle.perimeter()}")

    val pointInside = Point(3.0, 4.0)
    val pointOutside = Point(6.0, 0.0)
    val pointCenter = Point(0.0, 0.0)

    println("Contains (3,4): ${circle.contains(pointInside)}")
    println("Contains (6,0): ${circle.contains(pointOutside)}")
    println("Contains (0,0): ${circle.contains(pointCenter)}")
}

