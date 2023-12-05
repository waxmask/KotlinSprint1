package lesson_2

fun main() {
    val inputStartTime : String = "9:39"
    val inputTravelTime : Int = 457 // minutes

    val departureHour : Int = inputStartTime.substring(0, inputStartTime.indexOf(':')).toInt()// час отправления будет числом записанным в строке до символа : данный символ разделяет часы и минуты, так мы точно получим часы
    val departureMinute : Int = inputStartTime.substring(inputStartTime.indexOf(':') + 1, inputStartTime.length).toInt() // минутами будем считать все что после символа : и до конца строки

    val allTime : Int = departureHour * 60 + departureMinute + inputTravelTime // получаем общее количество минут в пути

    val arrivalHour : Int = (allTime / 60) % 24 // час прибытия // берем остаток от деления потому что если время отправления будет 22:00 и 180 минут в пути то счетчик часов будет равен 22+3 = 25, так как мы живем по 24х часовому дню то берем остаток и получаем в этом случае 1 ночи
    val arrivalMinute : Int = allTime % 60 // минута прибытия

    println("Время отправления: $inputStartTime")
    println("Время в пути составит: ${inputTravelTime / 60}:${inputTravelTime % 60}")
    println("Время прибытия: $arrivalHour:$arrivalMinute")
}