package cast

/**
 * @author : LEX_YU
 */
fun main() {

    val any: Any = "test"

    if (any is String) {
        val s = any as String
        println(s.uppercase())

        println((any as? String)?.uppercase())
        println(any.uppercase())
    }

    val b: Any = 123
    val s1 = if (b is String) b else null
    println(s1)
    val s2: String? = any as? String
    println(s2)

    val o: Any = "o"
    println(o as? Int)
    println(o as Int?)
}