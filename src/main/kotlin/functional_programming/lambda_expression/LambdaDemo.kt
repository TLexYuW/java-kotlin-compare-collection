package functional_programming.lambda_expression

import functional_programming.ForKtCall

/**
 * @author : LEX_YU
 */
fun main() {
    val result = isEven(10)
    println(result)

    val list = listOf(1, 2, 3, 4)

    println(list.any(isEven))
    println(list.filter(isEven))

    // not bound ref
    list.any(::isEven)

    demo

    ForKtCall().postponeComputation(5000) { println("After 5 Secs, Test") }
}

val demo = run {
    println("Hey!")
}

val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }
fun isEven(i: Int): Boolean = i % 2 == 0