package function_demo

/**
 * @author : Lex Yu
 */
class Common2 {
    fun max(x: Int, y: Int): Int {
        return if (x > y) x else y
    }

    fun max2(x: Int, y: Int): Int = if (x > y) x else y

    fun displayMax(x: Int, y: Int): Unit {
        println(max(x, y))
    }
}