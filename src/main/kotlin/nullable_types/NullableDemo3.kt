package nullable_types

/**
 * @author : LEX_YU
 */

fun main() {
    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c
    println("$s1,$s2")
}