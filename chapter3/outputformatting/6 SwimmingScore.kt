package chapter3.outputformatting

/*
* In this program, we declare and initialize the variables:
* name, score, and maxScore as String, Int, and Int data types, respectively.

* We then calculate the percentage score by dividing the score by maxScore and multiplying it by 100.

* To ensure that the percentage variable is stored as a Double, we use the toDouble() function
* to convert the score and maxScore variables to Double data types before performing the calculation.

* Finally, we use string interpolation to display the required information,
* with the percentage variable formatted to two decimal places using the "% .2f" format specifier.
*/

fun main() {

    val name: String = "Linda"
    val score: Int = 38
    val maxScore: Int = 50
    val percentage: Double = score.toDouble() / maxScore.toDouble() * 100

    println("$name's original score is $score out of $maxScore, which is ${"%.2f".format(percentage)}%.")
}
