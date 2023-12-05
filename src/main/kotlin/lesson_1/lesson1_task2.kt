package lesson_1

fun main() {
    val numberOfOrders: Int  = 75 // число заказов = 75
    val congratulationsText: String = "Поздравляем, ваш заказ успешно оформлен!" // текст поздравления
    var currentEmployeeNumber: Int = 2000 // переменная хранящая текущее количество работников

    // добавил немного забавного текста для украшения вывода, вообще можно и двумя принтами...
    println("Количество заказов: ${numberOfOrders}\r\n" +
            "Текст после оформления покупки: ${congratulationsText}") // вывод в консоль всех объявленных ранее переменных

   // println("На заводе трудится: ${currentEmployeeNumber} заводчан") // вывод текущего количества работников
    currentEmployeeNumber-- // уволился один сотрудник или можно currentEmployeeNumber = currentEmployeeNumber - 1
    println("На заводе трудится: ${currentEmployeeNumber} заводчан") // вывод текущего количества работников
}