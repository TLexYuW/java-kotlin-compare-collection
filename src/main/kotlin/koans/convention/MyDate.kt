package koans.convention

import java.util.*

/**
 * @author : Lex Yu
 */
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)
fun MyDate.followingDate(): MyDate {
    val c = Calendar.getInstance()
    c.set(this.year, this.month, this.dayOfMonth)

    val millisecondsInDay = 24 * 60 * 60 * 1000L
    val timeInMillis = c.timeInMillis + millisecondsInDay
    val result = Calendar.getInstance()

    result.timeInMillis = timeInMillis

    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondInADay = 24 * 60 * 60 * 1000L

    timeInMillis += amount * when (timeInterval) {
        TimeInterval.DAY -> millisecondInADay
        TimeInterval.WEEK -> 7 * millisecondInADay
        TimeInterval.YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}