package koans.convention

import java.util.Calendar

/**
 * @author : Lex Yu
 */
fun MyDate.followingDate(): MyDate {
    val c = Calendar.getInstance()
    c.set(this.year, this.month, this.dayOfMonth)
    val millisecondsInDay = 24 * 600 * 60 * 1000L
//    val timeImMillis =

    return MyDate(1,1,1)
}