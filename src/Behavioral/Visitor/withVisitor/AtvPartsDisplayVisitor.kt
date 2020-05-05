package Behavioral.Visitor.withVisitor

class AtvPartsDisplayVisitor: AtvPartVisitor {
    override fun visit(fender: Fender) {
        println("We have a fender")
    }

    override fun visit(oil: Oil) {
        println("We have oil")
    }

    override fun visit(wheel: Wheel) {
        println("We have a wheel")
    }

    override fun visit(partsOrder: PartsOrder) {
        println("We have an order")
    }

}