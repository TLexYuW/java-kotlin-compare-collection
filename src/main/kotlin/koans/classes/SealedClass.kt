package koans.classes

/**
 * @author : Lex Yu
 */

fun main() {

}

fun eval(expr: I_Expr): Int =
    when (expr) {
        is C_Num -> expr.value
        is C_Sum -> eval(expr.left) + eval(expr.right)
    }

sealed interface I_Expr
class C_Num(val value: Int) : I_Expr
class C_Sum(val left: I_Expr, val right: I_Expr) : I_Expr