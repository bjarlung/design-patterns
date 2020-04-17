package Behavioral.Observer

import java.util.*

//Concrete subject / observable
class MessageStream: Subject() {

    private var messageHistory: Deque<String> = ArrayDeque<String>()

    override fun setState(message: String) {
        messageHistory.add(message)
        this.notifyObservers()
    }

    override fun getState(): String {
        return messageHistory.last
    }

}

// Deque = A linear collection that supports element
// insertion and removal at both ends.
// The name deque is short for
// "double ended queue" and is usually pronounced "deck".