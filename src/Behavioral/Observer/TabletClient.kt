package Behavioral.Observer

class TabletClient(override val subject: Subject) : Observer() {

    init {
        subject.attach(this)
    }

    fun addMessage(message: String) {
        subject.setState("$message -sent from tablet")
    }

    override fun update() {
        println("Tablet Stream: ${subject.getState()}")
    }

}