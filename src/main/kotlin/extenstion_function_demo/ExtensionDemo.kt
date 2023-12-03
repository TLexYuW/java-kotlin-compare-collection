package extenstion_function_demo

/**
 * @author : Lex Yu
 */

fun main() {

    val c: Char = "abc".lastChar()
    println(c)
}

fun String.lastChar() = this.get(this.length - 1)