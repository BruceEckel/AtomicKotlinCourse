// BreakAndContinue/ForControl.kt
import atomictest.eq

fun main() {
  val nums = mutableListOf(0)
  for(i in 4 until 100 step 4) { // [2]
    if (i == 8) continue         // [1]
    if (i == 40) break           // [3]
    nums.add(i)
  }                              // [4]
  nums eq
  listOf(0,4,12,16,20,24,28,32,36)
}