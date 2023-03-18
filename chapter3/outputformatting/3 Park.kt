package chapter3.outputformatting

fun main() {

    val length: Int = 300
    val width: Int = 150

    val area: Int = length * width
    val perimeter: Int = 2 * (length + width)

    println("Park Length: $length m")
    println("Park Width: $width m")
    println("Park Area: $area m²")
    println("Park Perimeter: $perimeter m")
}
