package exception_demo

import java.io.IOException
import kotlin.jvm.Throws

/**
 * @author : Lex Yu
 */

fun main() {

}

fun foo() {
    throw IOException()
}

@Throws(IOException::class)
fun bar() {
    throw IOException()
}