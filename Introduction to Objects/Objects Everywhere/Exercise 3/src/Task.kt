package objectsEverywhere3

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.toLowerCase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var onlyLetters = ""
  for (ch in s) {
    if (ch in 'a'..'z' || ch in 'A'..'Z') {
      onlyLetters += ch
    }
  }
  return isPalIgnoreCase(onlyLetters)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}