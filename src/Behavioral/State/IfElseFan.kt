package Behavioral.State

class IfElseFan() {

    private var state = OFF

    fun pullChain() {
        if(state == OFF) {
            println("Turning fan on to low")
            state = LOW
        } else if(state == LOW) {
            println("Turning fan on to medium")
            state = MED
        } else if(state == MED) {
            println("Turning fan off")
            state = OFF
        }
    }

    override fun toString(): String {
        if(state == OFF) {
            return "Fan is off"
        } else if (state == LOW) {
            return "Fan is on low"
        }  else if (state == MED) {
            return "Fan is on medium"
        }
        return "Invalid state"
    }

    companion object {
        const val LOW = 0
        const val OFF = 1
        const val MED = 2
    }
}