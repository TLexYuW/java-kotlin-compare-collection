package functional_programming.lambda_expression.questions

/**
 * @author : LEX_YU
 */

fun main() {

    val list = listOf(3, 0, 5)

    println(duplicateNonZero(list))

    println(containsZero(list))

    println(duplicateNonZeroReturnFromLambda(list))

    println(duplicateNonZeroLocalFunction(list))

    println(duplicateNonZeroAnonymous(list))

    println(duplicateNonZeroNoReturn(list))

    // Same
    list.forEach {
        if (it == 0) return@forEach
        println(it)
    }
    for (e in list) {
        if (e == 0) continue
        println(e)
    }

    // Not Same
    foo(list)
    bar(list)

}

// return from function
fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        println("it = $it")
        if (it == 0) return listOf()
        listOf(it, it)
    }
}

fun containsZero(list: List<Int>): Boolean {
    list.forEach {
        if (it == 0) return true
    }
    return false
}

// return from lambda
fun duplicateNonZeroReturnFromLambda(list: List<Int>): List<Int> {
    return list.flatMap l@{
//        println("it = $it")
//        if (it == 0) return@flatMap listOf()
        if (it == 0) return@l listOf()
        listOf(it, it)
    }
}

// local fun
fun duplicateNonZeroLocalFunction(list: List<Int>): List<Int> {
    fun duplicateNonZeroElement(e: Int): List<Int> {
//        println(e)
        if (e == 0) return listOf()
        return listOf(e, e)
    }
    return list.flatMap(::duplicateNonZeroElement)
}

// anonymous function
fun duplicateNonZeroAnonymous(list: List<Int>): List<Int> {
    return list.flatMap(fun(e: Int): List<Int> {
//        println(e)
        if (e == 0) return listOf()
        return listOf(e, e)
    })
}

// no return
fun duplicateNonZeroNoReturn(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0)
            listOf()
        else
            listOf(it, it)
    }
}

// Compare return and break
fun foo(list: List<Int>) {
    list.forEach {
        if (it == 0) return
        println("foo e = $it")
    }
    println("foo - Last Line (return)")
}

fun bar(list: List<Int>) {
    for (e in list) {
        if (e == 0) break
        println("bar e = $e")
    }
    println("bar - Last Line (break)")
}