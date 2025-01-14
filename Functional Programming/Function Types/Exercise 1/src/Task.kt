package functionTypes1

import atomictest.eq

fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
  val result = mutableListOf<R>()
  for (e in this) {
    result += transform(e)
  }
  return result
}

fun main() {
  val list = listOf(1, 2, 3)
  list.map { "$it!" } eq listOf("1!", "2!", "3!")
}