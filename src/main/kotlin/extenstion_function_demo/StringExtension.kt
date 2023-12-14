package extenstion_function_demo

/**
 * @author : Lex Yu
 */
fun main() {
    val q = """To code,
        #or not ro code?..""".trimMargin(marginPrefix = "#")
    println(q)

    val k = """
        Keep calm
        and learn Kotlin""".trimIndent()
    println(k)

//    val regex =  "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    val regex =  """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println(regex.matches("01.01.1970"))
    println(regex.matches("1970.01.01"))

    println("123".toInt())
    println("1e-10".toDouble())
    println("123".toIntOrNull())
    println("xx".toIntOrNull())
//    println("xx".toInt()) // err
}

fun String.lastChar() = this.get(this.length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}