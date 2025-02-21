import main.PalindromeService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PalindromeServiceTest {
    private val solver = PalindromeService()

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> = Stream.of(
            Arguments.of("abac", "aba"),
            Arguments.of("tacag", "aca"),
            Arguments.of("wegeeksskeegyuwe", "geeksskeeg")
        )
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testFindLongestPalindrome(input: String, expected: String) {
        assertEquals(expected, solver.findLongestPalindrome(input))
    }
}