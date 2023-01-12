import junit.framework.TestCase.assertEquals
import org.junit.Test

internal class NumbersTest{

    @Test
    fun test_sum(){
        val numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()

        val expected = 16
        assertEquals(expected, actual)

    }
}