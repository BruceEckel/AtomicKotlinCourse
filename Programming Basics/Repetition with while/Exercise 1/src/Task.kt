package repetitionwithwhile1

fun sum(number: Int): Int {
  var sum = 0
  var i = 0
  while (i <= number) {
    sum += i
    i++
  }
  return sum
}

fun main() {
  println(sum(10))  // 55
}