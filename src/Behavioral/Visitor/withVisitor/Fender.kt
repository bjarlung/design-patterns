package Behavioral.Visitor.withVisitor

//Concrete element
class Fender: AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}