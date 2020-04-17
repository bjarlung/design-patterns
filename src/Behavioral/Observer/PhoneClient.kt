package Behavioral.Observer

class PhoneClient(override val subject: Subject) : Observer() {
    init {
        subject.attach(this)
    }

    fun addMessage(message: String) = subject.setState("$message - sent from phone")

    override fun update() {
        println("Phone Stream: ${subject.getState()}")
    }
}