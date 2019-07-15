// ComplexConstructors/GameMatrix.kt
package complexconstructors
import atomictest.eq

class GameElement(val symbol: Char)

class GameMatrix(
  val width: Int,
  val height: Int,
  representation: String
) {
  val cells = MutableList(height) {     // [1]
    MutableList<GameElement?>(width) { null }
  }
  init {
    val lines = representation.lines()  // [2]
    for (y in 0 until height) {
      for (x in 0 until width) {
        val ch = lines[y][x]
        if (ch != ' ')
          cells[y][x] = GameElement(ch) // [3]
      }
    }
  }
  override fun toString() =
    cells.joinToString("\n") { row ->
      row.joinToString("") { element ->
        "${element?.symbol ?: ' '}"
      }
    }
}

fun main() {
  val matrix = GameMatrix(4, 3, """
    # ##
       #
    #.##
    """.trimIndent())
  matrix.cells[1][0] = GameElement('R')
  matrix eq """
    # ##
    R  #
    #.##
    """.trimIndent()
}