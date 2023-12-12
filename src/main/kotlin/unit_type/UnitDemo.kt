package unit_type

/**
 * @author : Lex Yu
 */

fun main() {
    call { v-> println("Processing value = $v") }
}

fun call(block: (Int) -> Unit): Unit = (1..100).forEach(block)

