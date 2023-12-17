package nullable_types.questions

/**
 * @author : LEX_YU
 */
fun main() {
    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y
    println(sum)

    val r = (x ?: 0) + y
    println(r)
}
