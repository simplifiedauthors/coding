package chapter3.outputformatting

/*
* In this code, we declare five variables
* companyName and employeeName as String,
* hoursWorked is Int
* ratePerHour and totalPay as Double

* We then calculate the totalPay by multiplying hoursWorked and ratePerHour.
*/


fun main() {

    val companyName: String = "ABC Tech"
    val employeeName: String = "Edward Zulu"
    val hoursWorked: Int = 30
    val ratePerHour: Double = 213.50
    val totalPay: Double = hoursWorked * ratePerHour

    println("Company Name: $companyName")
    println("Employee Name: $employeeName")
    println("Hours Worked: $hoursWorked")
    println("Rate Per Hour: R$ratePerHour")
    println("Total Pay: R$totalPay")

    // The commented lines show how this can be done using a multiline String

   // println("""
   //    |Company Name: $companyName
   //    |Employee Name: $employeeName
   //    |Hours Worked: $hoursWorked
   //    |Rate Per Hour: R$ratePerHour
   //    |Total Pay: R$totalPay
   // """.trimMargin())

}
