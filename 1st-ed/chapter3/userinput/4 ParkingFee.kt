package chapter3.userinput

/*
* This program prompts the user to enter the parking fee in Rands using readln().
* The input is converted to a Double data type and multiplied by 100 to get the amount in cents.

* The program then calculates the number of each coin required to pay the parking fee using a series of
* modulus operations.
* The number of coins of each denomination is calculated by dividing the remaining amount by the value of
* the coin and then taking the integer part of the result.

* Finally, the program outputs the number of coins of each denomination required to pay the parking fee.
*/


    fun main() {

        print("Enter the parking fee in Rands: ")
        val parkingFee: Double = readln().toDouble()
        val amountInCents: Int = (parkingFee * 100).toInt()

        val r5coins = amountInCents / 500
        val remainderAfterR5: Int = amountInCents % 500

        val r2coins: Int = remainderAfterR5 / 200
        val remainderAfterR2: Int = remainderAfterR5 % 200

        val r1coins: Int = remainderAfterR2 / 100
        val remainderAfterR1: Int = remainderAfterR2 % 100

        val fiftyCoins: Int = remainderAfterR1 / 50
        val remainderAfterFifty = remainderAfterR1 % 50

        val twentyCoins = remainderAfterFifty / 20
        val remainderAfterTwenty: Int = remainderAfterFifty % 20

        val tenCoins: Int = remainderAfterTwenty / 10

        println() // Prints empty line to separate input prompts from output
        println("To pay a parking fee of R$parkingFee, you will need to put in:")
        println("$r5coins x R5 coins")
        println("$r2coins x R2 coins")
        println("$r1coins x R1 coins")
        println("$fiftyCoins x 50c coins")
        println("$twentyCoins x 20c coins")
        println("$tenCoins x 10c coins")
    }

