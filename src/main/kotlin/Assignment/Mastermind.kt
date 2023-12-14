package Assignment

import java.text.FieldPosition

/**
 * @author : Lex Yu
 */
data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { TODO() }
    val commonLetters = "ABCDEF".sumOf { ch ->
        Math.min(secret.count { TODO() }, guess.count { TODO() })
//        secret.count { TODO() }.coerceAtMost(guess.count { TODO() })
    }

    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main() {

}