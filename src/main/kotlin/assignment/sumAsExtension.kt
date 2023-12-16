package assignment

/**
 * @author : LEX_YU
 */
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun List<Int>.sumReceiver(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main() {
    val sum = sum(listOf(1, 2, 3))
    println(sum)

    val sum2 = listOf(4, 5, 6).sumReceiver()
    println(sum2)
}