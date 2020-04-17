package Behavioral.Memento

class Employee (var name: String, val address: String, var phone: String) {

    fun save(): EmployeeMemento = EmployeeMemento(name, phone)

    fun revert(employeeMemento: EmployeeMemento) {
        this.name = employeeMemento.name
        this.phone = employeeMemento.phone
    }

    override fun toString() = "Name: $name. Phone: $phone"
}