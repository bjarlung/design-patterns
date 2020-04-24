package Behavioral.State

class FanOffState(private val fan: Fan) : State() {

    override fun handleRequest() {
        println("Turning fan on to low")
        fan.setState(fan.getFanLowState())
    }

    override fun toString(): String {
        return "Fan is off"
    }

}
