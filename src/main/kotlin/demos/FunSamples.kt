package demos

/**
 * @author : Lex Yu
 */
fun main() {
    println("ABCD".zip("BCDE").count { it.first == it.second })

    val s = "abcdefg"
    println(s.zipWithNext())

    println(s.windowed(4))
    println(s.windowed(3))
    println(s.windowed(2))
    println(s.windowed(1))

    println(s.windowed(2, step = 4))
    println(s.windowed(3, step = 4))
}