package lesson_2

import kotlin.math.floor

fun main() {
    val extraMatterialsBuff : Float = 0.2f // 20% усиление
    val cristallOreCounter : Int = 7 // счетчик для кристаллической руды
    val ironOreCounter : Int = 11 // счетчик для железной руды

    val cristallOreWithBuff = (cristallOreCounter * extraMatterialsBuff).toInt()
    val ironOreWithBuff = (ironOreCounter * extraMatterialsBuff).toInt()

    println("Добыто кристаллической руды: $cristallOreCounter || Бонусные кристаллы за время действия баффа: $cristallOreWithBuff")
    println("Добыто металлической руды: $ironOreCounter || Бонусный металл за время действия баффа: $ironOreWithBuff")

}