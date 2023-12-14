package extenstion_function_demo

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertNotNull

/**
 * @author : Lex Yu
 */
class ExtensionDemoKtTest {

    @Test
    fun joinToStringTest() {
        val result = listOf('a', 'b', 'c').joinToString(separator = "-", prefix = "(", postfix = ")")
        val expected = "(a-b-c)"
        assertEquals(expected, result)
    }

    @Test
    fun getOrNullTest() {
        val list = listOf("abc")
        assertNotNull(list.getOrNull(0))
        assertNull(list.getOrNull(1))
    }

    @Test
    fun withIndexTest() {
        val list = listOf('a', 'b', 'c')
        val result = mutableListOf<String>()

        for ((i, e) in list.withIndex()) {
            println("$i, $e")
            result.add("$i, $e")
        }

        val expected = listOf("0, a", "1, b", "2, c")

        assertEquals(expected, result)
    }
}
