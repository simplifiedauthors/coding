package chapter3.userinput

fun main() {

    println("Enter the name of three months and their rainfall readings.")

    print("Name of the 1st Month: ")
    val month1: String = readln()
    print("Rainfall for $month1: ")
    val rainfall1: Double = readln().toDouble()

    print("Name of the 2nd Month: ")
    val month2: String = readln()
    print("Rainfall for $month2: ")
    val rainfall2: Double = readln().toDouble()

    print("Name of the 3rd Month: ")
    val month3: String = readln()
    print("Rainfall for $month3: ")
    val rainfall3: Double = readln().toDouble()

    // Calculate the average rainfall
    val averageRainfall: Double = (rainfall1 + rainfall2 + rainfall3) / 3

    // Output
    println() // Prints empty line to separate input prompts from output
    println("%-15s %-15s".format("Month", "Rainfall (mm)")) // Table Headings
    println("-------------------------------") // Headings separators 15+15+1 dashes = 31.
    println("%-15s %-8.2f".format(month1,rainfall1))
    println("%-15s %-8.2f".format(month2, rainfall2))
    println("%-15s %-8.2f".format(month3, rainfall3))

    println() // Prints empty line to separate table from average
    println("Average rainfall: %.2f mm".format(averageRainfall))
}
