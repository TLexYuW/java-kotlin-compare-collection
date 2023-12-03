package exception_demo

/**
 * @author : Lex Yu
 */

fun main() {
    val num = 1000;

    val perentage =
        if (num in 0..100) num else
            throw IllegalArgumentException("A percentage value must be between 0 and 100: $num")

    println(perentage)
}