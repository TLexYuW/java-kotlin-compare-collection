package koans.convention

/**
 * @author : Lex Yu
 */
fun main() {
    val myDate1 = MyDate(2022, 12, 8)
    val myDate2 = MyDate(2023, 12, 9)
    val date =  MyDate(2023, 1, 9)

    println(checkInRange(date, myDate1, myDate2))
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}