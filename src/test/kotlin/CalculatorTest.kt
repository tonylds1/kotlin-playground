import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun `should return 5 when adding 2 and 3`() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}
