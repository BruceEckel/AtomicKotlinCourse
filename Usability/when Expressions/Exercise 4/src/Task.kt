package whenExpressions4

import atomictest.eq

fun getBmiStatus(
    kg: Double,
    heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return when {
    bmi < 18.5 -> "Underweight"
    bmi < 25 -> "Normal weight"
    else -> "Overweight"
  }
}

fun main() {
  getBmiStatus(72.57, 1.727) eq "Normal weight"
}