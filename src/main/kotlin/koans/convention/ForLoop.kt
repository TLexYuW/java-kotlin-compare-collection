package koans.convention

import java.util.NoSuchElementException

/**
 * @author : Lex Yu
 */

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start

            override fun hasNext(): Boolean = current <= end

            override fun next(): MyDate {
                if (!hasNext()) {
                    throw NoSuchElementException()
                }
                val result = current
                current = current.followingDate()
                return result
            }
        }
    }
}

fun main() {
    iterateOverDateRange(MyDate(2023, 11, 1), MyDate(2023, 12, 2))
    { date -> println(date) };
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}