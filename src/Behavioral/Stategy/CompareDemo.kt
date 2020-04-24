package Behavioral.Stategy

import java.util.*

fun main() {

    val bryan = Person("Bryan", "08-453435", 39)
    val sarah = Person("Sara", "0838301", 46)
    val clare = Person("Clare", "07938930", 38)

    var people = listOf<Person>(bryan, sarah, clare)

    println("Not sorted")
    println(people)

    Collections.sort(people) { person1: Person, person2: Person ->
        if (person1.age > person2.age) {
            1
        } else if (person1.age < person2.age) {
            -1
        } else {
            0
        }
    }

    println("Sorted by age")
    println(people)

    val nameComparator = compareBy<Person> {
        it.name
    }
    /*
    Alt.
    Collections.sort(people) { person1: Person, person2: Person ->
        person1.name.compareTo(person2.name)
    }
     */

    println("Sorted by name")
    println(people.sortedWith(nameComparator))

}