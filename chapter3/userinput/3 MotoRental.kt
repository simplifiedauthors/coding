package chapter3.userinput

fun main() {

    print("Enter the starting odometer reading (km): ")
    val startOdometer: Int = readln().toInt()

    print("Enter the ending odometer reading (km): ")
    val endOdometer: Int = readln().toInt()

    print("Enter the number of days rented: ")
    val numDays: Int = readln().toInt()

    val pricePerKM:Double = 3.20
    val rentalPerDay:Double = 220.00

    val distanceTravelled: Int = endOdometer - startOdometer
    val mileageCost: Double = distanceTravelled * pricePerKM
    val rentalCost: Double = numDays * rentalPerDay
    val totalCost: Double = mileageCost + rentalCost

    println() // Prints empty line to separate input prompts from output
    println("Odometer reading: $startOdometer - $endOdometer km")
    println("Days rented: $numDays")
    println("Rental cost: R$${"%.2f".format(rentalCost)}")
    println("Mileage cost: R$${"%.2f".format(mileageCost)}")
    println("Total cost: R$${"%.2f".format(totalCost)}")

}
