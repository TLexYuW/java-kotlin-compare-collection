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


}