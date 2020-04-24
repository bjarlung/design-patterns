package Behavioral.State


class FanLowState(private val fan: Fan): State() {
    override fun handleRequest() {
        println("Turning fan to medium")
        fan.setState(fan.getFanMediumState())
    }


    override fun toString(): String {
        return "Fan is low"
    }
}