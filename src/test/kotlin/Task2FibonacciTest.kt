import org.junit.Assert.assertArrayEquals
import org.junit.Test
import subtask6.Fibonacci

class Task2FibonacciTest {

    private val fibonacci = Fibonacci()

    @Test
    fun testFibonacci1() {
        val result = intArrayOf(21, 34, 1)
        assertArrayEquals(result, fibonacci.productFibonacciSequenceFor(714))
    }

    @Test
    fun testFibonacci2() {
        val result = intArrayOf(34, 55, 0)
        assertArrayEquals(result, fibonacci.productFibonacciSequenceFor(800))
    }


    @Test
    fun testFibonacci3() {
        val result = intArrayOf(5, 8, 1)
        assertArrayEquals(result, fibonacci.productFibonacciSequenceFor(40))
    }


    @Test
    fun testFibonacci4() {
        val result = intArrayOf(8, 13, 0)
        assertArrayEquals(result, fibonacci.productFibonacciSequenceFor(100))
    }
}
