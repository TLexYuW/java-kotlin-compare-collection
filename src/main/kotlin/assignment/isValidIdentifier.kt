package assignment

/**
 * @author : LEX_YU
 */
fun isValidIdentifier(str: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetter()

    if (str.isEmpty() || str[0].isDigit()) return false
    for (ch in str) {
        if (!isValidCharacter(ch)) return false
    }

    return true
}

fun main() {
//    val name = "123"
//    val _name = "123"
//    val _12 = 123
//    val  = "" // err
//    val 012 = ""  // err
//    val no$ = ""  // err
//    val $no = "" // err

    println(isValidIdentifier("name"))
    println(isValidIdentifier("_name"))
    println(isValidIdentifier(""))
    println(isValidIdentifier("012"))
    println(isValidIdentifier("no$"))
}