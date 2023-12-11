package lesson_3

fun main() {
    var startPoint = "E2"
    var endPoint = "E4"
    var moviesNum = 0

    var outputString = "$startPoint-$endPoint:$moviesNum"
    println(outputString)

    startPoint = "D2"
    endPoint = "D3"
    moviesNum++

    outputString = "$startPoint-$endPoint:$moviesNum"
    println(outputString)
}