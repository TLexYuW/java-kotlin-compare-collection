package loop_demo

/**
 * @author : Lex Yu
 */

fun main() {
    for (i in 1..10) {
        print(i)
    }

    println()

    for (i in 1 until 10) {
        print(i)
    }

    println()

    for (ch in "abc") {
        print(ch + 1)
    }
}