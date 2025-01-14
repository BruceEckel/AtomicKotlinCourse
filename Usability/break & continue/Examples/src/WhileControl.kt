// BreakAndContinue/WhileControl.kt
import atomictest.eq

fun main() {
  val nums = mutableListOf(0)
  var i = 0
  while(i < 100) {
    i += 4
    if (i == 8) continue
    if (i == 40) break
    nums.add(i)
  }
  nums eq
  listOf(0,4,12,16,20,24,28,32,36)
}