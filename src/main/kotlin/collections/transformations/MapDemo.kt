package collections.transformations

/**
 * @author : Lex Yu
 */
fun main() {
    val numbers = listOf("one", "two", "three")
    val indexes = listOf(1, 2, 3)
    val twoIndexes = listOf(1, 2)

    println(numbers.map { "it = $it" })
    println(numbers.mapNotNull { if (it.length == 3) null else it })

    println(numbers.mapIndexed { index, s -> "$index-$s" })
    println(numbers.mapIndexedNotNull { index, s ->
        if (s.length == 3) null else "$index-$s"
    })
}
