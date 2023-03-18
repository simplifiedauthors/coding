package chapter3.outputformatting

fun main() {

    val pi: Float = 3.14f
    val diameter: Float = 27.0F
    val radius: Float = diameter / 2.0f
    val area: Float = pi * radius * radius
    val circumference: Float = 2 * pi * radius

    println("The area of the pizza is $area cm²")
    println("The circumference of the pizza is $circumference cm")
}
