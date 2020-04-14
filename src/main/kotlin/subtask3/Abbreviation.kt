package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        val output = a.toUpperCase().toMutableList()
        val charsToDelete = mutableListOf<Char>()

        for (char in output) {
            if (!b.contains(char)) {
                charsToDelete.add(char)
            }
        }

        for (char in charsToDelete) {
            if (output.contains(char)) {
                output.remove(char)
            }
        }
        return if (output.joinToString("") == b) "YES" else "NO"
    }
}
