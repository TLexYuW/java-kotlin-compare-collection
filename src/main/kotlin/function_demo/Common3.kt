@file:JvmName("Util")

package function_demo

/**
 * @author : Lex Yu
 */
class Common3 {

    /**
     * Member Function
     */
    fun member() = 2
}

/**
 * Top-level Function
 */
fun topLevel() = 1

/**
 * Local Function
 */
fun other() {
    fun local() = 3
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        println(character)
    }
}

@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0): Int = a + b + c;

fun main() {
    displaySeparator();
    displaySeparator('?', 3);
}