package lesson_1

fun main() {
    // объявление переменных. возможно время можно было бы хранить в строке чтобы не дописывать 0 в случае с
    // 0 <= time <= 9 или даже в специальном типе данных, но пока я такого типа не знаю в котлине
    val yearFlight: Int = 1961
    var hourFlight: String = "09"
    var minuteFlight: String = "07"

    println(
        "Год полета - ${yearFlight}" + "\r\n" +     // вывод в консоль сообщения, опять же можно использовать два принта
                "\r\nчас: ${hourFlight} \r\nминута: ${minuteFlight}"
    )

    hourFlight = "10"     // присваивание нового "часа"
    minuteFlight = "55"   // присваивание нового "часа"

    print("Посадка - ${hourFlight}:${minuteFlight}")    // вывод сообщения с временем посадки
}