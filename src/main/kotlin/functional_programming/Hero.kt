package functional_programming

import functional_programming.Gender.*

/**
 * @author : LEX_YU
 */
data class Hero(
    val name: String,
    val age: Int,
    val gender: Gender?
)

enum class Gender { MALE, FEMALE }

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, MALE),
        Hero("F", 42, MALE),
//        Hero("F", 100, MALE),
        Hero("K", 9, null),
        Hero("L", 29, FEMALE),
        Hero("M", 29, MALE),
        Hero("S", 37, MALE),
        Hero("GroupBy-TEST", 29, null),
    )

    println(heroes.last().name)
    println(heroes.firstOrNull { it.age == 30 }?.name)
//    println(heroes.first { it.age == 30 }?.name) // err
    println(heroes.map { it.age })
    println(heroes.map { it.age }.distinct())
    println(heroes.map { it.age }.distinct().size)
    println(heroes.filter { it.age < 30 })
    println(heroes.filter { it.age < 30 }.size)
    println(heroes.maxBy { it.age })
    println(heroes.minBy { it.age })
    println(heroes.all { it.age < 50 })
    println(heroes.any { it.gender == FEMALE })

    val mapByAge: Map<Int, List<Hero>> = heroes.groupBy { it.age }
    println(mapByAge)
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size }!!
    println(age)
    println(group)

    val mapByName: Map<String, Hero> = heroes.associateBy { it.name }
    println(mapByName)
    println(mapByName["F"]?.age)
    println(mapByName.getValue("F").age)
    println(mapByName["NTP"]?.age) // null
//    println(mapByName.getValue("NTP").age) // err

    val mapByName2 = heroes.associate { it.name to it.age }
    println(mapByName2)
    println(mapByName2.getOrElse("Unknown") { 0 })

    /*
    val map = heroes.flatMap { heroes.map { hero -> it to hero } }
    map.forEach { pair -> println(pair) }
    val (first, second) = heroes
        .flatMap { heroes.map { hero -> it to hero } }
        .maxBy { it.first.age - it.second.age }
    println(first)
    println(second)
     */
    val allPossiblePairs = heroes.flatMap { first -> heroes.map { second -> first to second } }
    val (oldest, youngest) = allPossiblePairs.maxBy { it.first.age - it.second.age }
    println(oldest)
    println(youngest)
}
