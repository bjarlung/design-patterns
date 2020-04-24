package Behavioral.State

class FanHighState(private val fan: Fan): State() {

    override fun handleRequest() {
        println("Turning fan off")
        fan.setState(fan.getFanOffState())
    }

    override fun toString(): String {
        return "Fan is on high"
    }
}