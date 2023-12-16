package nullable_types

/**
 * @author : LEX_YU
 */

fun main() {
    val s: String? = null
//    if (s != null) {
//        s.length
//    }
    s?.length
    println(s?.length)

    //-------------------------------------------->

    val s1: String? = "123"
    val length = if (s1 != null) s1.length else null;
    val length2 = s1?.length
    println(length2?.javaClass)

    //-------------------------------------------->

    val s2: String? = null
    val length3: Int = if (s2 != null) s2.length else 0;
    val length4: Int = s2?.length ?: 0
    println(length4.javaClass)
}