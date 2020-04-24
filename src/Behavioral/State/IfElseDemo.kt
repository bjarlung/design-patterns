package Behavioral.State

fun main() {
    val ifElseFan: IfElseFan = IfElseFan()
    println(ifElseFan)

    ifElseFan.pullChain()
    println(ifElseFan)

    ifElseFan.pullChain()
    println(ifElseFan)


}