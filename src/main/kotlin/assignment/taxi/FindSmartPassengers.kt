package assignment.taxi

/**
 * @author : Lex Yu
 */

fun TaxiPark.findSmartPassengers1(): Set<Passenger> {
    val (tripWithDiscount, tripWithoutDiscount) = trips.partition { it.discount != null }
    return allPassengers
        .filter { passenger ->
            tripWithDiscount.count { passenger in it.passengers } >
                    tripWithoutDiscount.count { passenger in it.passengers }
        }.toSet()
    /*
    val pair = trips.partition { it.discount is Double }
    return allPassenger
        .filter { passenger ->
            pair.tripWithDiscount.count { it.passengers.contains(passenger) } >
                    pair.tripWithoutDiscount.count { it.passengers.contains(passenger) }
        }.toSet()
     */
}


fun TaxiPark.findSmartPassengers2(): Set<Passenger> {
    /*
    val groupBy: Map<Passenger, List<List<Trip>>> = allPassengers
        .groupBy(
            { it },
            { p -> trips.filter { t -> p in t.passengers } }
        )
     */

    return allPassengers
        .associateWith { p -> trips.filter { t -> p in t.passengers } }
        .filterValues { group ->
            val (withDiscount, withoutDiscount) = group.partition { it.discount != null }
            withDiscount.size > withoutDiscount.size
        }
        .map { it.key }
        .toSet()


    /*
    return allPassengers
        .associateWith { p -> trips.filter { t -> p in t.passengers } }
        .entries
        .filter { entry ->
            val group = entry.value
            val (withDiscount, withoutDiscount) = group.partition { it.discount != null }
            withDiscount.size > withoutDiscount.size
        }
        .map { it.key }
        .toSet()
     */
}


fun TaxiPark.findSmartPassengers3(): Set<Passenger> =
    allPassengers.filter { p ->
        val withDiscount = trips.count { t -> p in t.passengers && t.discount != null }
        val withoutDiscount = trips.count { t -> p in t.passengers && t.discount == null }
        withDiscount > withoutDiscount
    }.toSet()