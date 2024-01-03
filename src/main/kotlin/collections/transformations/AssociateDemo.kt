package collections.transformations

/**
 * @author : Lex Yu
 */

fun main() {
    // convert list to map
    println(g_number_list.associateWith { element -> element.length })
    println(g_number_list.associateWith { it.length })
}

