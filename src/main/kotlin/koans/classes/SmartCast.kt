package koans.classes

/**
 * @author : Lex Yu
 */
fun main() {
    println(eval(Num(10)))

    val num1 = Num(2)
    val num2 = Num(3)
    val sumExpr = Sum(num1, num2)

    val result = eval(sumExpr)

    println("Result of Sum(${num1.value}, ${num2.value}): $result")
}

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
data class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr