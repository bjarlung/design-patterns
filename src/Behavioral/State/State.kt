package Behavioral.State

abstract class State {

    open fun handleRequest() {
        println("Shouldn't be able to get here")
    }

    override fun toString(): String {
       return "Fan is off"
   }
}