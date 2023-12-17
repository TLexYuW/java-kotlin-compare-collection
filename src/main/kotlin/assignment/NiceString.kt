package assignment

/**
 * @author : Lex Yu
 */
fun main() {
    val str = "tewopiagfdlakglkafsa"

    println(str.isNiceOrigin())

}

fun String.isNice(): Boolean {

//    val noBadSubstring = setOf("ba", "be", "bu").all { !this.contains(it) }
    val noBadSubstring = setOf("ba", "be", "bu").none() { this.contains(it) }

//   val hasThreeVowels = count { it in setOf('a', 'e', 'i', 'o', 'u') } >= 3
    val hasThreeVowels = count { it in "aeiou" } >= 3

    val hasDouble = zipWithNext().any { it.first == it.second }
//    (0 until lastIndex).any { this[it] == this[it + 1] }
//    windowed(2).any { it[0] == it[1] }

//    listOf(noBadSubstring, hasThreeVowels, hasDouble).filter { it == true }.size >= 2
    return listOf(noBadSubstring, hasThreeVowels, hasDouble).count() { it } >= 2
}

fun String.isNiceOrigin(): Boolean {

    val noBadSubstring = !contains("ba") && !contains("be") && !contains("bu")

    val hasThreeVowels = count {
        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u'
    } >= 3

    var hasDouble = false
    if (length > 1) {
        var prevCh: Char? = null
        for (ch in this) {
            if (ch == prevCh) {
                hasDouble = true
            }
            prevCh = ch
        }
    }

    var conditions = 0
    if (noBadSubstring) conditions++
    if (hasThreeVowels) conditions++
    if (hasDouble) conditions++

    if (conditions >= 2) {
        return true
    }
    return false
}