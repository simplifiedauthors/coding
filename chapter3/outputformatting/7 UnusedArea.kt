package chapter3.outputformatting

    fun main() {

        val propertyLength: Int = 80
        val propertyWidth: Int = 35
        val houseLength: Int = 50
        val houseWidth: Int = 20
        val poolDiameter: Int = 8
        val pi: Double = 3.14 // For circular calculation

        val propertyArea: Int = propertyLength * propertyWidth
        val houseArea: Int = houseLength * houseWidth
        val poolRadius: Double = poolDiameter / 2.0
        val poolArea: Double = pi * poolRadius * poolRadius
        val unusedArea: Double = propertyArea - (houseArea + poolArea)

        println("Area of property: $propertyArea m²")
        println("Area of house: $houseArea m²")
        println("Area of pool: $poolArea m²")
        println("Area of unused land: $unusedArea m²")
}
