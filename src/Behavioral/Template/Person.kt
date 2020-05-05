package Behavioral.Template

class Person (
        val name: String,
        val phoneNumber: String,
        val age: Int
): Comparable<Person> {

        override fun compareTo(other: Person): Int {
                if (this.age > other.age) {
                        return 1
                } else if (this.age < other.age) {
                        return -1
                }
                return 0
        }

        override fun toString(): String {
                return "name: $name. Phone: $phoneNumber. Age: $age"
        }
}