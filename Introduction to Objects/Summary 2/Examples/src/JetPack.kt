// Summary2/JetPack.kt

class JetPack(
  private var fuel: Double     // [1]
) {
  private var warning = false
  private fun burn() =         // [2]
    if (fuel - 1 <= 0) {
      fuel = 0.0
      warning = true
    } else
      fuel -= 1
  public fun fly() = burn()    // [3]
  fun check() =                // [4]
    if (warning)               // [5]
      "Warning"
    else
      "OK"
}

fun main() {
  val jetPack = JetPack(3.0)
  while(jetPack.check() != "Warning") {
    println(jetPack.check())
    jetPack.fly()
  }
  println(jetPack.check())
}
/* Output:
OK
OK
OK
Warning
*/