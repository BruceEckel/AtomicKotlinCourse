// ExtensionFunctions/StrangeQuote.kt
import atomictest.eq
import quoting.singleQuote
import quoting.doubleQuote

// Apply two sets of single quotes:
fun String.strangeQuote() =
  this.singleQuote().singleQuote()   // [1]

fun String.tooManyQuotes() =
  doubleQuote().doubleQuote()        // [2]

fun main() {
  "Hi".strangeQuote() eq "''Hi''"
  "Hi".tooManyQuotes() eq "\"\"Hi\"\""
}