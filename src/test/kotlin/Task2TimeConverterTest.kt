import org.junit.Assert.assertEquals
import org.junit.Test
import subtask2.TimeConverter

class Task2TimeConverterTest {

    private val converter = TimeConverter()

    @Test
    fun testTimeConverter1() {
        assertEquals("eleven o' clock", converter.toTextFormat("11", "00"))
    }

    @Test
    fun testTimeConverter2() {
        assertEquals("five minutes past nine", converter.toTextFormat("9", "05"))
    }

    @Test
    fun testTimeConverter3() {
        assertEquals("quarter past four", converter.toTextFormat("4", "15"))
    }

    @Test
    fun testTimeConverter4() {
        assertEquals("half past two", converter.toTextFormat("2", "30"))
    }

    @Test
    fun testTimeConverter5() {
        assertEquals("twenty two minutes to six", converter.toTextFormat("5", "38"))
    }

    @Test
    fun testTimeConverter6() {
        assertEquals("quarter to six", converter.toTextFormat("5", "45"))
    }

    @Test
    fun testTimeConverter7() {
        assertEquals("two minutes to eleven", converter.toTextFormat("10", "58"))
    }

    @Test
    fun testTimeConverter8() {
        assertEquals("", converter.toTextFormat("11", "62"))
    }
}
