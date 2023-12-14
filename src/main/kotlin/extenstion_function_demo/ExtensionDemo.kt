package extenstion_function_demo

/**
 * @author : Lex Yu
 */

fun main() {

    val c: Char = "abc".lastChar()
//    println(c)

    val s: String = "ab".repeat(3);
//    println(s)

    println(1 until 10)

    val ans = "Answer".to(100)
    println(ans)

    val pair = "hot" to "RED"
    println(pair)

    val map = mapOf(0 to "Zero", 1 to "One", 2 to "Two")
    println(map)

    println('a'.isLetter())
    println('#'.isLetterOrDigit())

}

fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'
fun Char.isLetterOrDigit() = isLetter() || this in '0'..'9'
