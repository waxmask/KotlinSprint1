package lesson_2

fun main() {
    val employeeNumber: Int = 50
    val employeeSalary: Int = 30_000

    val internsNumber: Int = 30
    val internsSalary: Int = 20_000

    val costEmployeeSalary: Int = employeeNumber * employeeSalary // получаем затраты на выплаты постоянным сотрудникам
    val costInternsSalary: Int = internsNumber * internsSalary //  получаем затраты на выплаты стажерам сотрудникам

    val totalExpenses = costEmployeeSalary + costInternsSalary // общие затраты на зп сотрудников

    val averageSalary = totalExpenses / (employeeNumber + internsNumber) // средняя зп

    println("Расходы на выплату зарплаты постоянных сотрудников: $costEmployeeSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}