package assignment.taxi.funs

import assignment.taxi.Passenger
import assignment.taxi.TaxiPark
import assignment.taxi.Trip

/**
 * @author : Lex Yu
 */

fun TaxiPark.findFaithfulPassengers1(minTrips: Int): Set<Passenger> =
    trips
        .flatMap(Trip::passengers)
        .groupBy { passenger -> passenger }
        .filterValues { group -> group.size >= minTrips }
        .keys
/*
trips
    .flatMap { it.passengers }
    .groupBy { it }
    .filter { it.value.size >= minTrips }
    .map { it.key }
    .toSet()
 */


fun TaxiPark.findFaithfulPassengers2(minTrips: Int): Set<Passenger> =
    allPassengers
        .filter { p ->
            trips.count { p in it.passengers } >= minTrips
        }
        .toSet()
/*
allPassenger
    .partition { p ->
        trips.sumBy { t ->
            if (p in t.passengers) 1 else 0
        } >= minTrips
    }
    .first
    .toSet()
 */
