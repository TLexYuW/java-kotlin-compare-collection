package Assignment

import extenstion_function_demo.eq
import java.text.FieldPosition

/**
 * @author : Lex Yu
 */
data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { it.first == it.second }
    val commonLetters = "ABCDEF".sumOf { ch ->
        Math.min(secret.count { TODO() }, guess.count { TODO() })
//        secret.count { TODO() }.coerceAtMost(guess.count { TODO() })
    }

    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main() {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)

    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result

}