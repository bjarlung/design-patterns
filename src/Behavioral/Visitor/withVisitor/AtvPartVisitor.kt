package Behavioral.Visitor.withVisitor

//Visitor
interface AtvPartVisitor {

    fun visit(fender: Fender)
    fun visit(oil: Oil)
    fun visit(wheel: Wheel)
    fun visit(partsOrder: PartsOrder)
}