package collections.demos.sequence_demo

/**
 * @author : Lex Yu
 */

fun main() {
    val sequenceNum = sequenceOf("one", "two", "three", "four")
//    println("sequenceNum = $sequenceNum")
    sequenceNum.forEachIndexed { index, str -> println("index: $index, element: $str") }

    val numbers = listOf("one", "two", "three", "four")
    numbers.forEachIndexed { index, str -> println("index: $index, element: $str") }
    val numSequence = numbers.asSequence()
//    println("numSequence = $numSequence")
    numSequence.forEachIndexed { index, str -> println("index: $index, element: $str") }

    println("------------------------------------------------------------------------")

    val oddNumbers = generateSequence(1) { it + 2 }
    println(oddNumbers.take(7).toList())

    println("------------------------------------------------------------------------")

    val numbersYield = sequence<Int> {
        yield(1)
        yieldAll(listOf(3, 5))
        yieldAll(generateSequence(1) { it + 2 })
    }

    println(numbersYield.take(10).toList())

}