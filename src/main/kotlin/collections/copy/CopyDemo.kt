package collections.copy

/**
 * @author : Lex Yu
 */
fun main() {
    // Shallow Copy
    // toList()、toMutableList()
    val sourceList = listOf(1,2,3,4,5)
    println("sourceList = ${sourceList.hashCode()}")

    val newList = sourceList.toList()
    println("newList = ${newList.hashCode()}")

    val mutableList = newList.toMutableList()
    println("mutableList = ${mutableList.hashCode()}")

    val set = sourceList.toSet()
    println("set = ${set.hashCode()}")

    mutableList.add(6)

    println("sourceList = ${sourceList.hashCode()}")
}