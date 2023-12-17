package functional_programming.lambda_expression.member_refs

import class_demo.Person

/**
 * @author : LEX_YU
 */
fun main() {

    // function ref
    val predicate = ::isEven
    val o_predicate = { i: Int -> isEven(i) }

    // member ref
    val o_action = { person: Person, message: String -> sendEmail(person, message) }
    val action = ::sendEmail
    action(Person("Receiver", 100), "TEST Message")
}

fun sendEmail(person: Person, message: String) {
    println("Send $message to ${person.name}")
}

fun isEven(i: Int): Boolean = i % 2 == 0
