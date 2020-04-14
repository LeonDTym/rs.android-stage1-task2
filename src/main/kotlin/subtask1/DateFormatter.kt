package subtask1

import javafx.beans.binding.When
import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        try {
            val date = LocalDate.of(year.toInt(), Month.of(month.toInt()), day.toInt())

            return "${date.dayOfMonth} ${getMonth(date.month)}, ${getDayOfWeek(date.dayOfWeek)}"
        } catch (e: DateTimeException) {
            return "Такого дня не существует"
        }
    }

    private fun getDayOfWeek(dayOfWeek: DayOfWeek) : String {
        return when(dayOfWeek) {
            DayOfWeek.MONDAY -> "понедельник"
            DayOfWeek.TUESDAY -> "вторник"
            DayOfWeek.WEDNESDAY -> "среда"
            DayOfWeek.THURSDAY -> "четверг"
            DayOfWeek.FRIDAY -> "пятница"
            DayOfWeek.SATURDAY -> "суббота"
            else -> "воскресенье"
        }
    }

    private fun getMonth(dayOfMonth: Month) : String {
        return when(dayOfMonth) {
            Month.JANUARY -> "января"
            Month.FEBRUARY -> "февраля"
            Month.MARCH ->  "марта"
            Month.APRIL ->  "апреля"
            Month.MAY -> "мая"
            Month.JUNE -> "июня"
            Month.JULY -> "июля"
            Month.AUGUST -> "августа"
            Month.SEPTEMBER -> "сентября"
            Month.OCTOBER -> "октября"
            Month.NOVEMBER -> "ноября"
            else -> "декабря"
        }
    }
}
