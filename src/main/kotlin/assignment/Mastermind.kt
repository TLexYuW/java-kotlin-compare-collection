package assignment

import extenstion_function_demo.eq
import io.github.oshai.kotlinlogging.KotlinLogging


/**
 * @author : Lex Yu
 */
private val logger = KotlinLogging.logger {}

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { it.first == it.second }
    val commonLetters = "ABCDEF".sumOf { ch ->
        logger.info { "ch = $ch" }
        Math.min(secret.count {
            logger.info { "secret it = $it" }
            it == ch
        }, guess.count {
            logger.info { "guess it = $it" }
            it == ch
        })
    }
    logger.info { "rightPositions = $rightPositions" }
    logger.info { "commonLetters = $commonLetters" }

    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main() {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)

    evaluateGuess("BCDF", "ACEB") eq result
//    evaluateGuess("AAAF", "ABCA") eq result
//    evaluateGuess("ABCA", "AAAF") eq result

}