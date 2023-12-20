package assignment.taxi.funs

import assignment.taxi.TaxiPark
import assignment.taxi.Trip

/**
 * @author : Lex Yu
 */

fun TaxiPark.findTheMostFrequentTripDurationPeriod(): IntRange? {
    return trips
        .groupBy {
            val start: Int = it.duration / 10 * 10
            val end = start + 9
            start..end
        }
        .maxBy { (_, group: List<Trip>) -> group.size }
        ?.key

//    return trips
//        .groupBy {
//            val start: Int = it.duration / 10 * 10
//            val end = start + 9
//            start..end
//        }
//        .toList()
//        .sortedByDescending { (_, second: List<Trip>) -> second.size }
//        ?.firstOrNull()
//        ?.first
}