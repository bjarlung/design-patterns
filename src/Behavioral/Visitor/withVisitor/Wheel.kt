package Behavioral.Visitor.withVisitor

//Concrete element
class Wheel: AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}