package collections.demos.map_demo

import extenstion_function_demo.eq

/**
 * @author : Lex Yu
 */

fun main() {
    val numMap = mapOf("Key1" to 1, "Key2" to 2, "Key3" to 3)
    println(numMap.keys)
    println(numMap.values)
    println(numMap.entries)
    println(numMap["Key1"])
    println(numMap.getOrDefault("Key4", "Doesn't Exist Key"))
    println("------------------------------------------------------------------")
    println("${numMap.containsValue(1)}, ${1 in numMap.values}")
    println("${numMap.containsKey("Key1")}, ${"Key1" in numMap.keys}")
    numMap.forEach { entry -> println(entry) }

    println("------------------------------------------------------------------")
    val filterMap = mapOf("K1" to 1, "K2" to 2, "K5" to 5, "K10" to 10)
    println(filterMap.filter { (key, value) ->
        key.endsWith("1") && value < 10
    })

    println(filterMap.filterKeys { it.endsWith("2") })
    println(filterMap.filterValues { it < 3 })
    println("------------------------------------------------------------------")

    val numMapX = mapOf("K1" to 1, "K2" to 2, "K3" to 3)
    val numMap2 = mapOf("K2" to 2, "K1" to 1, "K3" to 3)
    println("numMapX == numMap2 : ${numMapX == numMap2}")

    println("------------------------------------------------------------------")
    val mutableMap = mutableMapOf("K1" to 1, "K2" to 2)
    mutableMap["K3"] = 3
    mutableMap.put("K1", 1111111)
    println(mutableMap)
}