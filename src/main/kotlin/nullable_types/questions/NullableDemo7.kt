package nullable_types.questions

/**
 * @author : LEX_YU
 */
fun main() {
//    isFoo1(null)
//    isFoo2(null)
    isFoo3(null)
    isFoo4(null)
}

class Name(val name: String) {
}

fun isFoo1(n: Name) = n.name == "foo"
//fun isFoo2(n: Name?) = n.name == "foo"
fun isFoo3(n: Name?) = n != null && n.name == "foo"
fun isFoo4(n: Name?) = n?.name == "foo"