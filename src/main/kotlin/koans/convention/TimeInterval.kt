package koans.convention

/**
 * @author : Lex Yu
 */
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)
