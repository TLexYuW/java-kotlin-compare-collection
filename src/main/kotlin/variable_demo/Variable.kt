package variable_demo

/**
 * @author : Lex Yu
 */
class Variable {

}
fun main() {
    val question = "life, the universe, and everything"
    println("$question?")
//    question = "1";

    var answer = 100;
    answer = 0;

    val langs = mutableListOf("Java")
    langs.add("Kotlin")
    println(langs)

    val readOnlyList = listOf("Java")
//    readOnlyList.add("Kotlin")
}
