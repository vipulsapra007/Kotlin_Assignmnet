import kotlin.math.pow
import kotlin.math.sqrt

fun calculateStandardDeviation(numbers: List<Double>): Double {
    val mean = numbers.average()
    val sumOfSquaredDifferences = numbers.map { (it - mean).pow(2) }.sum()
    val variance = sumOfSquaredDifferences / numbers.size
    return sqrt(variance)
}

fun main() {
    val numbers = listOf(2.5, 3.7, 1.8, 6.4, 2.1)
    val standardDeviation = calculateStandardDeviation(numbers)
    println("Standard Deviation: $standardDeviation")
}
