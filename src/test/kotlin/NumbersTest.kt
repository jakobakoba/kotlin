import junit.framework.TestCase.assertEquals
import org.junit.Test


internal class NumbersTest {

    @Test
    fun test_sum() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected = 16
        assertEquals(expected, actual)
    }
    @Test
    fun test_subtract() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.subtract()
        val expected = 8
        assertEquals(expected, actual)
    }

    @Test
    fun divide(){
        val numbers: Numbers = Numbers.Base(12,4)
        val actual = numbers.divide()
        val expected = 3.0
        assertEquals(expected, actual)
    }
    @Test
    fun divide_double(){
        val numbers: Numbers = Numbers.Base(10,4)
        val actual = numbers.divide()
        val expected = 2.5
        assertEquals(expected, actual,0.002)
    }


}