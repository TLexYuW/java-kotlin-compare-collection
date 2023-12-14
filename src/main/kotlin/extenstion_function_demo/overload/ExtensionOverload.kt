package extenstion_function_demo.overload

/**
 * @author : Lex Yu
 */

fun main() {
    println(A().foo(2))
}

class A {
    fun foo() = "Member"
}

fun A.foo(i: Int) = "Extension($i)"