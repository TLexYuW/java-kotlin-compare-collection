package collections.demos.set_demo

/**
 * @author : Lex Yu
 */
fun main() {
    val numSet = setOf("one", "two", "three")
    println(numSet.first())

    println(numSet.last())
    for (index in numSet.indices) {
        println("index: $index")
    }

    numSet.forEach { print("$it, ") }

    println()

    numSet.forEachIndexed { index, entry -> println("index: $index, entry: $entry") }

    val numSet2 = setOf("two", "one", "three")

    println("numSet == numSet2 : ${numSet == numSet2}")

    var numSet3 = mutableSetOf("one", "two", "three")
    numSet3.add("four")
    println(numSet3)
    numSet3.remove("two")
    println(numSet3)

    println("---------------------------------------------------------------")

    val numSets = setOf("one", "two", "three")
    val otherNumSet1 = setOf("four", "five")
    val otherNumSet2 = setOf("ten", "one")
    val otherNumSet3 = setOf("three", "four")
    println(numSets union otherNumSet1)
    println(numSets intersect otherNumSet2)
    println(numSets subtract otherNumSet3)
}