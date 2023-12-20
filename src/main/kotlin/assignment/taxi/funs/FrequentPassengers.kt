package assignment.taxi.funs

import assignment.taxi.Driver
import assignment.taxi.Passenger
import assignment.taxi.TaxiPark
import assignment.taxi.Trip

/**
 * @author : Lex Yu
 */

fun TaxiPark.findFrequentPassengers1(driver: Driver): Set<Passenger> =
    trips
        .filter { trip -> trip.driver == driver }
        .flatMap(Trip::passengers)
        .groupBy { passenger -> passenger }
        .filterValues { group -> group.size > 1 }
        .keys

fun TaxiPark.findFrequentPassengers2(driver: Driver): Set<Passenger> =
    allPassengers
        .filter { p ->
            trips.count { it.driver == driver && p in it.passengers } > 1
        }
        .toSet()
