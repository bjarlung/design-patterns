package Behavioral.Visitor.withoutVisitor

fun main(){
    val order1: PartsOrder = PartsOrder()
    order1.addPart(Wheel(), Fender(), Oil())

    val shippingCost = order1.calculateShipping()

    println(shippingCost)
}