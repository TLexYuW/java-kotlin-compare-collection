package functional_programming.lambda_expression.member_refs.bound_and_non_bound

import class_demo.Person

/**
 * @author : LEX_YU
 */

fun main() {
    // regular non-bound ref
    val agePredicate: (Person, Int) -> Boolean = Person::isOlder

    val o_agePredicate: (Person, Int) -> Boolean = { person, ageLimit -> person.isOlder(ageLimit) }

    val alice = Person("Alice", 29)
    println(agePredicate(alice, 21))
    println(o_agePredicate(alice, 21))

    // bound ref
    val boundAgePredicate: (Int) -> Boolean = alice::isOlder
    println(boundAgePredicate(21))

    val result = alice.getAgePredicate()
    println(result(21))
}