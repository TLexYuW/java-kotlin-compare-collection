package assignment

/**
 * @author : Lex Yu
 */
fun main() {
    println("ABCD".zip("BCDE").count { it.first == it.second })
}