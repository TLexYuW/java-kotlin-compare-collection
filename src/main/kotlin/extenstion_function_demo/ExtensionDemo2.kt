package extenstion_function_demo

import extenstion_function_demo.child.Child
import extenstion_function_demo.parent.Parent
import extenstion_function_demo.parent.foo

/**
 * @author : Lex Yu
 */
fun main() {

    getAns() eq 50

    val parent: Parent = Child()
    println(parent.foo())

    println("abc".get(1))

}

fun getAns() = 100

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

fun String.get(index: Int) = '*'

