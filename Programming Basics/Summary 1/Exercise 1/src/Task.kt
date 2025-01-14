package summary1

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0
  while (worker > 0) {
    if (worker % 10 == digit) {
      occurrences++
    }
    worker /= 10
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}