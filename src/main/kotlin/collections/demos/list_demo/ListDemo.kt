package collections.demos.list_demo

/**
 * @author : Lex Yu
 */
fun main() {
    var numbers1 = mutableListOf("one", "two", "three", "four")
    numbers1.add("five")
    println(numbers1)
    numbers1 = mutableListOf("six", "seven")
    println(numbers1)

    val numbers2 = mutableListOf("1", "2", "3", "4")
    numbers2.add("5")
    println(numbers2)
//    numbers2 = mutableListOf("six", "seven") // error

}