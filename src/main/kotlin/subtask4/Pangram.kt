package subtask4

class Pangram {

    fun getResult(inputString: String): String {



        if (isPangram(inputString)) {
           return filter(inputString, true)
        } else {
            return filter(inputString, false)
        }
    }

    fun isPangram(input: String): Boolean {

        var letters = arrayListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

        input.forEach { if (letters.contains(it.toLowerCase())) letters.remove(it.toLowerCase()) }

        return letters.isEmpty()
    }

    private fun filter(input: String, isPangram: Boolean) : String {

        val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')

        val words = input.split(" ").filter { it != "" && it != "\n" }.toTypedArray()

        for (index in words.indices) {
            var iterator = 0

            val word = words[index].toCharArray()

            for (char in word.indices) {
                if (isPangram) {
                    if (vowels.contains(word[char].toLowerCase())) {
                        word[char] = word[char].toUpperCase()
                        iterator += 1
                    }
                } else {
                    if (!vowels.contains(word[char].toLowerCase()) && word[char].isLetter()) {
                        word[char] = word[char].toUpperCase()
                        iterator += 1
                    }
                }
            }

            words[index] = iterator.toString() + word.joinToString("")

        }

        var output = words.sortedBy { it.first() }.joinToString(" ")

        return output
    }
}
