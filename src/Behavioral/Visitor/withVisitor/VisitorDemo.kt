package Behavioral.Visitor.withVisitor


fun main(){
    val order: PartsOrder = PartsOrder()
    order.addPart(Wheel(), Fender(), Oil(), Fender())

    order.accept(AtvPartsShippingVisitor())
    order.accept(AtvPartsDisplayVisitor())
}