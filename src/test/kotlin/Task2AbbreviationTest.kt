import org.junit.Assert.assertEquals
import org.junit.Test
import subtask3.Abbreviation

class Task2AbbreviationTest {

    private val converter = Abbreviation()

    @Test
    fun testAbbreviation1() {
        assertEquals("YES", converter.abbreviationFromA("daBcd", "ABC"))
    }

    @Test
    fun testAbbreviation2() {
        assertEquals("YES", converter.abbreviationFromA("mnbTy", "BT"))
    }

    @Test
    fun testAbbreviation3() {
        assertEquals("YES", converter.abbreviationFromA("qWerty", "WY"))
    }

    @Test
    fun testAbbreviation4() {
        assertEquals("NO", converter.abbreviationFromA("ytrewq", "RY"))
    }

    @Test
    fun testAbbreviation5() {
        assertEquals("NO", converter.abbreviationFromA("abhfs", "ASCI"))
    }
}
