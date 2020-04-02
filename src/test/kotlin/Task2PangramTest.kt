import org.junit.Assert.assertEquals
import org.junit.Test
import subtask4.Pangram

class Task2PangramTest {

    private val pangram = Pangram()

    @Test
    fun testPangram1() {
        val inputStr = "Sphinx of black quartz, judge my vow."
        val resultStr = "1SphInx 1Of 1blAck 1mY 1vOw. 2qUArtz, 2jUdgE"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram2() {
        val inputStr = "Pack my box with five dozen liquor jugs. - Mark Dunn"
        val resultStr = "0- 1PAck 1mY 1bOx 1wIth 1jUgs. 1MArk 1DUnn 2fIvE 2dOzEn 3lIqUOr"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram3() {
        val inputStr =
            "Sympathizing would fix Quaker objectives. Sympathizing would fix Quaker objectives. Sympathizing would fix Quaker objectives."
        val resultStr =
            "1fIx 1fIx 1fIx 2wOUld 2wOUld 2wOUld 3QUAkEr 3QUAkEr 3QUAkEr 4SYmpAthIzIng 4ObjEctIvEs. 4SYmpAthIzIng 4ObjEctIvEs. 4SYmpAthIzIng 4ObjEctIvEs."
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram4() {
        val inputStr = "By Jove, my quick study of lexicography won a prize!"
        val resultStr = "1BY 1mY 1Of 1wOn 1A 2JOvE, 2qUIck 2stUdY 2prIzE! 5lExIcOgrAphY"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram5() {
        val inputStr = "Hello! I'm Jhon Doe!!!"
        val resultStr = "1I'M 1Doe!!! 3HeLLo! 3JHoN"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram6() {
        val inputStr =
            " \uF8FF \uF8FF \uF8FF \uF8FF \uF8FF \uF8FFBy Jove, my quick st☁☁udy of ☁lexicography won a prize! @ ☁☁☁"
        val resultStr =
            "0\uF8FF 0\uF8FF 0\uF8FF 0\uF8FF 0\uF8FF 0@ 0☁☁☁ 1\uF8FFBY 1mY 1Of 1wOn 1A 2JOvE, 2qUIck 2st☁☁UdY 2prIzE! 5☁lExIcOgrAphY"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram7() {
        val inputStr =
            " \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF\uF8FF\uF8FF \uF8FF\uF8FF\uF8FF \uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF \uF8FF \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF \uF8FF"
        val resultStr =
            "0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF 0\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF 0\uF8FF"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram8() {
        val inputStr = "TWO driven jock helped fax my big quiz."
        val resultStr = "1My 2TWO 2FaX 2BiG 2QuiZ. 3JoCK 4DRiVeN 4HeLPeD"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram9() {
        val inputStr = "                     "
        val resultStr = ""
        assertEquals(resultStr, pangram.getResult(inputStr))
    }

    @Test
    fun testPangram10() {
        val inputStr = "asdasdasdasda \n" +
                "                            sdasdadasd sadasdasdas \n" +
                "                            sadadad  "
        val resultStr = "4SaDaDaD 7SDaSDaDaSD 7SaDaSDaSDaS 8aSDaSDaSDaSDa"
        assertEquals(resultStr, pangram.getResult(inputStr))
    }
}
