package collections.demos.list_demo

/**
 * @author : Lex Yu
 */

fun main() {
    val myList = listOf("apple", "banana", "orange")
    val myArray = myList.toTypedArray()
    println(myArray.contentToString())

    val myArray2 = arrayOf("apple", "banana", "orange")
    val myList2 = myArray2.toList()
    println(myList2)

    val myArray3 = arrayOf("apple", "banana", "orange")
    val myMutableList = myArray3.toMutableList()
    println(myMutableList)

}