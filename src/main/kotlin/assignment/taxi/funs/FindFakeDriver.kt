package assignment.taxi.funs

import assignment.taxi.Driver
import assignment.taxi.TaxiPark

/**
 * @author : Lex Yu
 */

fun TaxiPark.findFakeDrivers1(): Set<Driver> =
    allDrivers.filter { d -> trips.none { it.driver == d } }.toSet()

fun TaxiPark.findFakeDrivers2(): Set<Driver> =
//    allDriver.minus(trips.map { it.driver })
    allDrivers - (trips.map { it.driver })