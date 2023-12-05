package lesson_2

import kotlin.math.pow

fun main() {
    val clientScore : Int = 70_000
    val interestRate : Double = 16.7 // 16,7%
    val period : Int = 20 // период - количество лет

    val futureScore = clientScore * (1 + interestRate / 100).pow(period) // подсчет сложного процента по формуле
    println("Через 20 лет на вашем счету окажется: ${String.format(" % .3f", futureScore)}") // вывод
}