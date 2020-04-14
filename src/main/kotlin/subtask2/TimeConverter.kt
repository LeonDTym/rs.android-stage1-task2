package subtask2

import java.time.DateTimeException
import java.time.LocalTime

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        return try {
            val time = LocalTime.of(hour.toInt(), minute.toInt())

            when(time.minute) {
                0 -> "${getStringValue(time.hour)} o' clock"
                15 -> "quarter past ${getStringValue(time.hour)}"
                in 1..29 -> "${getStringValue(time.minute)} minutes past ${getStringValue(time.hour)}"
                30 -> "half past ${getStringValue(time.hour)}"
                45 -> "quarter to ${getStringValue(time.hour + 1)}"
                else -> "${getStringValue(60 - time.minute)} minutes to ${getStringValue(time.hour + 1)}"
            }
        } catch (e: DateTimeException) {
            ""
        }
    }

    private fun getStringValue(input: Int) : String {
        return if (input < 20) {
            getUnits(input)
        } else {
            when(val units = input % 10) {
                0 -> getTens(input - units)
                else -> "${getTens(input - units)} ${getUnits(units)}"
            }
        }
    }

    private fun getUnits(number: Int) : String {
        return when (number) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10 -> "ten"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "fifteen"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            else -> "nineteen"
        }
    }

    private fun getTens(number: Int) : String {
        return when(number) {
            20 -> "twenty"
            30 -> "thirty"
            40 -> "forty"
            else -> "fifty"
        }
    }
}
