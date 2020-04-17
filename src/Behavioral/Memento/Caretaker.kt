package Behavioral.Memento

import java.util.*

//Caretaker
class Caretaker {
    private var employeeHistory: Stack<EmployeeMemento> = Stack()

    fun save(employee: Employee) = employeeHistory.push(employee.save())

    fun revert(employee: Employee) = employee.revert(employeeHistory.pop())
}