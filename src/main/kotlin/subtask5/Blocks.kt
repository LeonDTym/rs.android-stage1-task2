package subtask5

import subtask1.DateFormatter
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB) {
            String::class -> return getStringData(blockA)
            Int::class -> return getIntData(blockA)
            LocalDate::class -> return getDateData(blockA)
            else -> return 0
        }
    }

    fun getStringData(data: Array<*>) : String {
        var result = ""
        data.forEach { if (it is String) result += it }
        return result
    }

    fun getIntData(data: Array<*>): Int {
        var sum = 0;
        data.forEach { if (it is Int) sum += it }
        return sum
    }

    fun getDateData(data: Array<*>) : String {
        var date = LocalDate.of(1,1,1)
        data.forEach { if (it is LocalDate && date.isBefore(it)) date = it }

        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyy"))
    }
}
