package collections.transformations

/**
 * @author : Lex Yu
 */

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    // convert list to map
    println(numbers.associateWith { element -> element.length})
    println(numbers.associateWith { it.length })

}