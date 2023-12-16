package nullable_types

/**
 * @author : LEX_YU
 */

fun main() {
//    val s1: String = null // err
    val s1: String = "always not null"
    val s2: String? = null

    s1.length
//    s2.length // err
}