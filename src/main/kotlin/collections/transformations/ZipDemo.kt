package collections.transformations

import java.util.*

/**
 * @author : Lex Yu
 */

fun main() {
    println(g_num_map)

    println(g_num_map.mapKeys { it.key.uppercase(Locale.ROOT) })

    println(g_num_map.mapValues { it.value + it.key.length })
}