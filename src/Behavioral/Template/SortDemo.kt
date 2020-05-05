package Behavioral.Template

import java.util.*

fun main() {

    val bryan = Person("Bryan", "08-453435", 39)
    val sarah = Person("Sara", "0838301", 46)
    val clare = Person("Clare", "07938930", 38)

    var people = listOf<Person>(bryan, sarah, clare)

    println("Not sorted")
    println(people)

    Collections.sort(people)

    println("Sorted by age")
    println(people)

}