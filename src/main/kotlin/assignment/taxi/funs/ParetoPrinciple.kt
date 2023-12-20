package assignment.taxi.funs

import assignment.taxi.TaxiPark

/**
 * @author : Lex Yu
 */

fun TaxiPark.checkParetoPrinciple(): Boolean {
    if (trips.isEmpty()) return false

    val totalIncome = trips.sumByDouble { TODO() }

    val sortedDriversIncome: List<Double> = trips.groupBy { TODO() }
        .map { (_, tripsByDriver) -> tripsByDriver.sumByDouble { TODO() } }
        .sortedDescending()

    val numberOfTopDrivers = (0.2 * allDrivers.size).toInt()
    val incomeByTopDrivers = sortedDriversIncome.take(TODO())
        .sum()


    return incomeByTopDrivers >= 0.8 * totalIncome
}