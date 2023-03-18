package chapter3.userinput


/*
* The program prompts the user to enter the length and width of the driveway using println().
* The readln() function is used to read user input from the console, which returns a String.
* The toDouble() method is called on the input String to convert it to a Double data type,
* and assign the values to length and width.

* The area and perimeter are calculated using the formulas: area = length * width,
* and perimeter = 2 * (length + width).

* Finally, the results are displayed to the user using println().
*/


fun main() {

    println("Enter the length of the driveway (meters): ")
    val length: Double = readln().toDouble()

    println("Enter the width of the driveway (meters): ")
    val width: Double = readln().toDouble()

    val area: Double = length * width
    val perimeter: Double = 2 * (length + width)

    println("Length: $length m")
    println("Width: $width m")
    println("Area: $area m²")
    println("Perimeter: $perimeter m")
}
