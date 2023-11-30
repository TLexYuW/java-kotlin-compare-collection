import class_demo.Person

/**
 * @author : Lex Yu
 */
fun main(args: Array<String>) {
    // hello
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    // class
    val person = Person("A", 100);
    println(person.name)

    // fun
    println("Hello, ${args.getOrNull(0)}!")

    println("Hello, ${call()}")

    println("First ${foo()}, Second ${foo()}")


    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))
    println(listOf('a', 'b', 'c').joinToString(separator = "/"))

}

fun call(): String {
    return " World!";
}

fun foo(): String {
    println("Calculating foo...")
    return "foo";
}