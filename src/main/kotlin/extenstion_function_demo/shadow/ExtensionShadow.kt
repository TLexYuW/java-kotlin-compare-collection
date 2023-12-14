package extenstion_function_demo.shadow

/**
 * @author : Lex Yu
 */

fun main() {
    println(A().foo())
}

class A {
    fun foo() = 1
}

fun A.foo() = 2