package Behavioral.Observer

fun main() {

    val subject: Subject = MessageStream()

    val phoneClient: PhoneClient = PhoneClient(subject)

    val tabletClient: TabletClient = TabletClient(subject)

    phoneClient.addMessage("Here is a new message")
    tabletClient.addMessage("Another message")

}