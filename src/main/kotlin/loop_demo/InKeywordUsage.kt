package loop_demo

/**
 * @author : Lex Yu
 */
fun main() {
    println(isLetter('q'))
    println(isLetter('+'))

    println(recognize('@'))
    println(recognize('1'))
    println(recognize('a'))

    val intRange: IntRange = 1..9
    val anotherIntRange: IntRange = 1 until 9
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
//    val dateRange: ClosedRange<MyDate> = startDate..endDate

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

/**
 * 'a' <= c && c <= 'z'
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}