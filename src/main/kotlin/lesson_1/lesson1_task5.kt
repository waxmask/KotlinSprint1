package lesson_1

fun main() {
    val seconds:Int = 6480  // количество секунд, которые Гагарин провел в космосе.
    val timeString: String = getTimeFromSeconds(seconds)    // вызов функции с сохранением ее возвращаемого значения в переменную

    println(timeString) // вывод результата на экран
}


// функция конвертирующая количество секунд в формат времени
fun getTimeFromSeconds(inputSecondCounter:Int) : String {
    val hours : Int = inputSecondCounter / 3600             // 3600 секунд в одном часе, просто делим и получаем колво часов
    val minutes : Int = (inputSecondCounter % 3600) / 60    // берем остаток от деления на 3600 и делим на 60 получаем минуты
    val second : Int = inputSecondCounter % 60              // просто берем остаток от деления на 60 это оставшиеся секунды
    return String.format("%02d:%02d:%02d", hours, minutes, second)  // форматирум строку и возвращаем ее
}