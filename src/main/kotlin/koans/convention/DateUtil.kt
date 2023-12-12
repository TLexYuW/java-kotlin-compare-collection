package koans.convention

import java.util.Calendar

/**
 * @author : Lex Yu
 */
fun MyDate.followingDate(): MyDate {
    val c = Calendar.getInstance()
    c.set(this.year, this.month, this.dayOfMonth)

    val millisecondsInDay = 24 * 60 * 60 * 1000L
    val timeInMillis = c.timeInMillis + millisecondsInDay
    val result = Calendar.getInstance()

    result.timeInMillis = timeInMillis

    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}