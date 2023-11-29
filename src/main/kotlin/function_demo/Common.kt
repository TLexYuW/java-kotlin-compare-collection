package function_demo

/**
 * @author : Lex Yu
 */
class Common {

    // version 1
    /*
    fun updateWeather(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 10) {
            description = "cold"
            color = Color.BLUE
        } else if (degrees < 25) {
            description = "mild"
            color = Color.ORANGE
        } else {
            description = "hot"
            color = Color.RED
        }

        // ...
    }
     */

    // version 2
    /*
    fun updateWeather(degrees: Int) {
        val (description: String, color: Color) =
            if (degrees < 10) {
                Pair("cold", Color.BLUE)
            } else if (degrees < 25) {
                Pair("mild", Color.ORANGE)
            } else {
                Pair("hot", Color.RED)
            }
        // ...
    }
     */

    // version 3
    /*
    fun updateWeather(degrees: Int) {
        val (description, color) =
            if (degrees < 10) {
                Pair("cold", Color.BLUE)
            } else if (degrees < 25) {
                Pair("mild", Color.ORANGE)
            } else {
                Pair("hot", Color.RED)
            }
        // ...
    }
     */

    // version 4
    /*
    fun updateWeather(degrees: Int) {
        val (description, color) =
            when {
                degrees < 10 -> Pair("cold", Color.BLUE)
                degrees < 25 -> Pair("mild", Color.ORANGE)
                else -> Pair("hot", Color.RED)
            }
        // ...
    }
     */

    // version 5
    fun updateWeather(degrees: Int) {
        val (description, color) =
            when {
                degrees < 10 -> "cold" to Color.BLUE
                degrees < 25 -> "mild" to Color.ORANGE
                else -> "hot" to Color.RED
            }
        // ...
    }

}