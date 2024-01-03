package collections.transformations

/**
 * @author : Lex Yu
 */
fun main() {
    println(g_number_list.map { "it = $it" })
    println(g_number_list.mapNotNull { if (it.length == 3) null else it })

    println(g_number_list.mapIndexed { index, s -> "$index-$s" })
    println(g_number_list.mapIndexedNotNull { index, s ->
        if (s.length == 3) null else "$index-$s"
    })

    println(g_num_map)
}
