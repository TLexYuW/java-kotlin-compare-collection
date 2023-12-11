package koans.convention

/**
 * @author : Lex Yu
 */
fun main() {
    val myDate1 = MyDate(2023, 12, 8)
    val myDate2 = MyDate(2023, 12, 9)

    println(myDate1 < myDate2)
}
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

