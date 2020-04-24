package Behavioral.State

class FanMedState(private val fan: Fan): State() {


    override fun handleRequest() {
        println("Turning fan to high")
        fan.setState(fan.getFanHighState())
    }

    override fun toString(): String {
        return "Fan is medium"
    }

}