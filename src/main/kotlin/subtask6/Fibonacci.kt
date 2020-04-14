package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {

        var array = IntArray(3)

        var first = 0
        var second = 1

        while(true) {
          if (first * second == n) {
              array[0] = first
              array[1] = second
              array[2] = 1
              break
          } else if (first * second > n) {
              array[0] = first
              array[1] = second
              array[2] = 0
              break
          }

            val third = first + second
            first = second
            second = third
        }

        return array
    }
}
