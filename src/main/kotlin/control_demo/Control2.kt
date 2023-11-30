package control_demo

import model.Color

/**
 * @author : Lex Yu
 */

fun main() {
    println(updateWeather(100))
}

fun updateWeather(degrees: Int): Pair<String, Color> {
   return when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mild" to Color.ORANGE
            else -> "hot" to Color.RED
        }
}