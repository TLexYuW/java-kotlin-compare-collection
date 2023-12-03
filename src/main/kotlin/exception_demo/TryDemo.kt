package exception_demo

import java.lang.NumberFormatException

/**
 * @author : Lex Yu
 */

fun main() {
    val str = "abc";

    val number = try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        throw e
    }

    println(number)

}