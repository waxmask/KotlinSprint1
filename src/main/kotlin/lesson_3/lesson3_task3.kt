package lesson_3

fun main() {
    val inputNumber = 6

    val outputTable = """
        $inputNumber * 1 = ${inputNumber * 1}
        $inputNumber * 2 = ${inputNumber * 2}
        $inputNumber * 3 = ${inputNumber * 3}
        $inputNumber * 4 = ${inputNumber * 4}
        $inputNumber * 5 = ${inputNumber * 5}
        $inputNumber * 6 = ${inputNumber * 6}
        $inputNumber * 7 = ${inputNumber * 7}
        $inputNumber * 8 = ${inputNumber * 8}
        $inputNumber * 9 = ${inputNumber * 9}
        $inputNumber * 10 = ${inputNumber * 10}
    """.trimIndent()

    println(outputTable)
}