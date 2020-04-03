import org.junit.Assert.assertEquals
import org.junit.Test
import subtask1.DateFormatter

class Task2DateFormatterTest {

    private val formatter = DateFormatter()

    @Test
    fun testDateFormatter1() {
        assertEquals("15 марта, воскресенье", formatter.toTextDay("15", "3", "2020"))
    }

    @Test
    fun testDateFormatter2() {
        assertEquals("Такого дня не существует", formatter.toTextDay("29", "2", "2019"))
    }

    @Test
    fun testDateFormatter3() {
        assertEquals("19 ноября, четверг", formatter.toTextDay("19", "11", "1998"))
    }

    @Test
    fun testDateFormatter4() {
        assertEquals("31 декабря, вторник", formatter.toTextDay("31", "12", "2024"))
    }

    @Test
    fun testDateFormatter5() {
        assertEquals("Такого дня не существует", formatter.toTextDay("1", "13", "2020"))
    }
}
