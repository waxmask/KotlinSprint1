package lesson_2

/*
– Написать выражение, которое высчитывает средний балл;
– Распечатать результат в консоль;
– В консоли должно быть выведено дробное число с 2 знаками после запятой.
*/
fun main() {
    val studentRatingList : List<Int> = listOf(3,4,3,5) // храним список оценок учеников

    println(getAverageScore(studentRatingList)) // вызываем функкцию получения средней оценки и потом передаем ее в функцию println
}

fun getAverageScore(ratingList: List<Int>) : Float {
    var averageScore : Float = 0f

    for (score in ratingList){ // в цикле проходим по каждому элементу списка и накапливаем счетчик
        averageScore+=score
    }

    return  averageScore / ratingList.size // а тут получаем среднюю оценку поделив сумму всех оценок на их количество и возвращаем это значение
}
