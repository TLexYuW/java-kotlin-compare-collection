package koans.classes

/**
 * @author : Lex Yu
 */

fun main() {
    val intRational = 5.r()
    val pairRational = Pair(3, 8)

    println(intRational.numerator / intRational.denominator)
    println(pairRational.first / pairRational.second)
}

fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)