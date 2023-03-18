package chapter3.userinput

import javax.swing.JOptionPane

fun main() {

    val crop1: String = JOptionPane.showInputDialog("Enter name of the 1st crop")
    val yield1: Double = JOptionPane.showInputDialog("Enter yield of $crop1 in tons per hectare").toDouble()

    val crop2: String = JOptionPane.showInputDialog("Enter name of the 2nd crop")
    val yield2: Double = JOptionPane.showInputDialog("Enter yield of $crop2 in tons per hectare").toDouble()

    val crop3: String = JOptionPane.showInputDialog("Enter name of the 3rd crop")
    val yield3: Double = JOptionPane.showInputDialog("Enter yield of $crop3 in tons per hectare:").toDouble()

    val averageYield:Double = (yield1 + yield2 + yield3) / 3

    val column1Heading = "Crop"
    val column2Heading = "Yield (t/ha)"
    val outputTable:String = """
        |%-15s %-15s
        |------------------------------
        |%-15s %-8.2f
        |%-15s %-8.2f
        |%-15s %-8.2f
        |------------------------------
        |Average yield: %.2f
    """.trimMargin().format(column1Heading,  column2Heading,
    crop1, yield1,
    crop2, yield2,
    crop3, yield3,
    averageYield)

    JOptionPane.showMessageDialog(null, outputTable)
    println(outputTable) // Console output of table; better aligned than JOptionPane
}
