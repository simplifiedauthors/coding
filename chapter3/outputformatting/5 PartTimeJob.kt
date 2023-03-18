package chapter3.outputformatting

/*
* In this code, we declare the data types for all variables as Int:
* hourlyRate, weekdays, hoursPerDay, and weeks are all initialized with their respective values.

* We then calculate totalEarnings by multiplying the hourly rate with the number of weekdays, hours per day, and weeks.

* totalExpenses is calculated by adding the cost of the laptop, software, and savings.

*Finally, we calculate totalLeft by subtracting totalExpenses from totalEarnings.
*/


fun main() {

    val hourlyRate: Int = 110
    val weekdays: Int = 5
    val hoursPerDay: Int = 4
    val weeks: Int = 4

    val totalEarnings: Int = hourlyRate * weekdays * hoursPerDay * weeks
    val totalExpenses: Int = 5000 + 2000 + 1000
    val totalLeft: Int = totalEarnings - totalExpenses

    println("Total earnings: R$totalEarnings")
    println("Total expenses: R$totalExpenses")
    println("Total left after expenses: R$totalLeft")
}
