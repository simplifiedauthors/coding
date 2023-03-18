package chapter3.userinput

fun main() {

    // Ask for input
    print("Enter item code: ")
    val itemCode: String = readln()

    print("Enter original price: ")
    val originalPrice: Double = readln().toDouble()

    print("Enter discount percentage: ")
    val discountPercentage: Double = readln().toDouble()

    // Calculate prices
    val discountAmount: Double = originalPrice * discountPercentage / 100
    val finalCost: Double = originalPrice - discountAmount

    println() // Prints empty line to separate input prompts from output
    println("Item code: $itemCode")
    println("Original price: R$originalPrice")
    println("Discount percentage: $discountPercentage%")
    println("Discount amount: R$discountAmount")
    println("Final cost: R$finalCost")
}
