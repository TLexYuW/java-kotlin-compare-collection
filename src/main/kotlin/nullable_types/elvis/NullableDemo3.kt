package nullable_types.elvis

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

    val state = arrayOf("OK", null)
    val auth: String? = state.random()
    val password = auth ?: "No"
//    val password = if (auto != null) auto else "No"
    println(password)
}