package loop_demo

/**
 * @author : Lex Yu
 */

fun main() {

    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    for ((key, value) in map) {
        println("$key = $value")
    }
}