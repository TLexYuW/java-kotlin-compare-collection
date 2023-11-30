package loop_demo

/**
 * @author : Lex Yu
 */

fun main() {
    val list = listOf('x', 'y', 'z')
    for (s: Char in list) {
        println(s)
    }

    val list2 = listOf("a", "b", "c")
    for ((index, element) in list2.withIndex()) {
        println("$index: $element")
    }
}