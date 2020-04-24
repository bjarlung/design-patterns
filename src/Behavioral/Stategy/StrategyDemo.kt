package Behavioral.Stategy

fun main() {

    val amexCard = CreditCard(
            AmexStrategy(),
            "373424563845342",
            "04/2021",
            "784"
    )

    println("Amex card validity: ${amexCard.isValid()}")

    val fakeAmexCard = CreditCard(
            AmexStrategy(),
            "333424563845342",
            "04/2021",
            "666"
    )

    println("Fake amex card validity: ${fakeAmexCard.isValid()}")


    val visaCard = CreditCard(
            VisaStategy(),
            "4933424563845342",
            "04/2021",
            "897"
    )

    println("Visa card validity: ${visaCard.isValid()}")



}