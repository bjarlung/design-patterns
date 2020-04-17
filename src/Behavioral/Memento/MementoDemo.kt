package Behavioral.Memento

fun main() {

    val caretaker: Caretaker = Caretaker()
    val employee: Employee = Employee("Jessica", "Valgatan 4", "974982097")

    println("Employee before save:        $employee")

    caretaker.save(employee)
    employee.phone = "666"
    caretaker.save(employee)

    println("Employee after changed phone number: $employee")

    employee.phone = "444"

    caretaker.revert(employee)
    println("Reverts to last save points:  $employee")

    caretaker.revert(employee)
    println("Reverts again to original:  $employee")


}