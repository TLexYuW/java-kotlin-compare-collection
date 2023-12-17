package nullable_types.control_flow_analysis

/**
 * @author : LEX_YU
 */
fun main() {
    val s: String? = "123"

    if (s == null) return
    println(s.length)
}