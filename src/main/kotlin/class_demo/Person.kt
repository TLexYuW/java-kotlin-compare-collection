package class_demo

/**
 * @author : Lex Yu
 * data
 * - equals
 * - hashCode
 * - toString
 */
data class Person(var name: String, var age: Int) {
    fun isOlder(ageLimit: Int) = age > ageLimit

    // type : (Int) -> Boolean
    fun getAgePredicate() = this::isOlder
}
