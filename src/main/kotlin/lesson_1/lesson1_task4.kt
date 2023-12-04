package lesson_1

fun main() {
    val length:Long = 40_868_600_000
    val age:Byte = 27
    val partOfDay:Float = 0.075f // выбрал флоат, так как он занимает меньше памяти чем Double но при этом нужно дописать f после числа
    val seconds:Short = 6480
    val partOfYear:Double = 2.0547945205479453E-4
    val apogee:Int = 327000

    print("Расстояние $length\n" +
            "Возраст – $age\n" +
            "Часть дня – $partOfDay\n" +
            "Секунды – $seconds\n" +
            "Часть года – $partOfYear\n" +
            "Апогей орбиты – $apogee")
}