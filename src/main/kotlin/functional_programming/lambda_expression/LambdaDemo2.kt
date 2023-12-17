package functional_programming.lambda_expression

/**
 * @author : LEX_YU
 */
fun main() {

//    val f1: () -> Int? = null // err
    val f2: () -> Int? = { null }
    val f3: (() -> Int)? = null

    val cond = true
    val f3_v: ((Boolean) -> Int?)? = { if (it) 100 else null }
    println(f3_v?.invoke(cond))

//    val f4: (() -> Int)? = { null } // err

}
