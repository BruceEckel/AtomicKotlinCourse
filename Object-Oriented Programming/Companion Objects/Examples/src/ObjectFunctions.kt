// CompanionObjects/ObjectFunctions.kt
import atomictest.eq

class CompanionObjectFunction {
  companion object {
    private var n: Int = 0
    fun increment(): Int {
      n += 1
      return n
    }
  }
}

fun main() {
  CompanionObjectFunction.increment() eq 1
  CompanionObjectFunction.increment() eq 2
}