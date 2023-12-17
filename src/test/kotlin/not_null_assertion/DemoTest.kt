package not_null_assertion

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @author : LEX_YU
 */

class DemoTest {

    @Test
    fun demo() {
        val ans: String? = "42"
        assertEquals(42, ans!!.toInt())
    }
}