package chapter3.userinput

import javax.swing.JOptionPane

fun main() {

    val salary: Double = JOptionPane.showInputDialog("Enter employee's salary:").toDouble()
    val healthInsuranceRate: Double = JOptionPane.showInputDialog("Enter health insurance rate:").toDouble()
    val retirementFundRate: Double = JOptionPane.showInputDialog("Enter retirement fund rate:").toDouble()

    val employeeBenefits: Double = salary / 100000 * healthInsuranceRate + retirementFundRate

    JOptionPane.showMessageDialog(null, "Employee benefits per month: R$employeeBenefits")
}