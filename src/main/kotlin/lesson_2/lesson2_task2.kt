package org.example.lesson_2

fun main() {

    val salaryPermanentEmployees = 30000
    val salaryInterns = 20000

    val countPermanentEmployees = 50
    val countInterns = 30

    // Расходы на выплату зарплаты постоянных сотрудников
    val expensesPermanentEmployees = salaryPermanentEmployees * countPermanentEmployees
    val expensesInterns = salaryInterns * countInterns

    // Общие расходы по ЗП после прихода стажеров
    val expensesTotal = expensesPermanentEmployees + expensesInterns

    // Среднюю ЗП одного сотрудника после устройства стажеров
    val averageSalary = expensesTotal / (countPermanentEmployees + countInterns)

    println("Фонд оплаты труда постоянных сотрудников: $expensesPermanentEmployees")
    println("Общие расходы по ЗП: $expensesTotal")
    println("Средняя ЗП сотрудников: $averageSalary")

}