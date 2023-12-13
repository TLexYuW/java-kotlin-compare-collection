package koans.convention

import koans.convention.TimeInterval.*

/**
 * @author : Lex Yu
 */
fun main() {
    val currentDate = MyDate(2023, 1, 1)

    val resultTask1 = task1(currentDate)
    val resultTask2 = task2(currentDate)

    println("Task 1 result: $resultTask1")
    println("Task 2 result: $resultTask2")
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}
fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}