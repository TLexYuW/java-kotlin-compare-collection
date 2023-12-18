package assignment.taxi

/**
 * @author : Lex Yu
 */

fun TaxiPark.findFakeDrivers1(): Set<Driver> =
    allDriver.filter { d -> trips.none { it.driver == d } }.toSet()

fun TaxiPark.findFakeDrivers2(): Set<Driver> =
//    allDriver.minus(trips.map { it.driver })
    allDriver - (trips.map { it.driver })