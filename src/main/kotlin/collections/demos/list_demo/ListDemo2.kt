package collections.demos.list_demo

/**
 * @author : Lex Yu
 */
fun main() {
    var numbers = mutableListOf("one", "two", "three", "four")

    println(numbers[0])
    println(numbers.get(0))
    println(numbers.lastIndex)
    println(numbers.subList(0, 2))
    println(numbers.first())
    println(numbers.first { it.length > 3 })
//    println(numbers.first { it.length > 10 }) // throw err
    println(numbers.firstOrNull())
    println(numbers.find { it.length > 6 })
    println(numbers.last())
    println(numbers.last { it.contains('e') })
    println(numbers.lastOrNull { it.length > 6 })
    println(numbers.findLast { it.length > 6 })
    println(numbers.elementAtOrNull(4))
    println(numbers.elementAtOrElse(4) { index ->
        "The value for index $index is undefined"
    })
    println(numbers.random())
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
    println(numbers.isNullOrEmpty())

    val numList2 = List(5) { it ->
        println("it = $it")
        it * it
    } //  size, init
    println(numList2)

    val immutableNumList = listOf("two", "one", "three", "four")
    println("numbers == immutableNumList : ${numbers == immutableNumList}")

    println("=============================================================================")

    numbers.add("five")
    println(numbers)
    numbers.removeAt(0)
    println(numbers)
    numbers.remove("three")
    println(numbers)
    numbers[0] = "newOne"
    println(numbers)
    numbers.shuffle()
    println(numbers)
    numbers.removeAll { it.length == 4 }
    println(numbers)
    println(numbers.retainAll { it ->
        println(it.length)
        it.length == 5
    }) //  returns a boolean value indicating whether the collection was modified or not.
    println(numbers)


}