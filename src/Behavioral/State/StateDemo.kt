package Behavioral.State

fun main() {
    val fan: Fan = Fan()
    println(fan)

    fan.pullChain()
    println(fan)

    fan.pullChain()
    println(fan)

    fan.pullChain()
    println(fan)

    fan.pullChain()
    println(fan)

}