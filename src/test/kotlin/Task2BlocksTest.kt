import org.junit.Assert.assertEquals
import org.junit.Test
import subtask5.Blocks
import java.time.LocalDate

class Task2BlocksTest {

    private val robotPaphnutiy = Blocks()

    @Test
    fun testBlocks1() {
        val blockA = arrayOf(1, "4", 2, "3")
        assertEquals("43", robotPaphnutiy.getData(blockA, String::class))
    }

    @Test
    fun testBlocks2() {
        val blockA = arrayOf(1, "4", 12, "3")
        assertEquals(13, robotPaphnutiy.getData(blockA, Int::class))
    }

    @Test
    fun testBlocks3() {
        val blockA = arrayOf(
            111,
            "Sing, O goddess, the anger of Achilles son of Peleus, that brought countless ills upon the Achaeans.",
            LocalDate.parse("1924-06-16"),
            333,
            " Many a brave soul did it send hurrying down to Hades, and many a hero did it yield a prey to dogs and vultures...",
            1984
        )
        val result =
            "Sing, O goddess, the anger of Achilles son of Peleus, that brought countless ills upon the Achaeans. " +
                    "Many a brave soul did it send hurrying down to Hades, and many a hero did it yield a prey to dogs and vultures..."

        assertEquals(result, robotPaphnutiy.getData(blockA, String::class))
    }

    @Test
    fun testBlocks4() {
        val date1 = LocalDate.parse("2019-12-31")
        val date2 = LocalDate.parse("1986-04-13")
        val date3 = LocalDate.parse("2019-12-30")
        val blockA = arrayOf(1, "4", date1, 2, "3", date2, date3)
        assertEquals("31.12.2019", robotPaphnutiy.getData(blockA, LocalDate::class))
    }
}
