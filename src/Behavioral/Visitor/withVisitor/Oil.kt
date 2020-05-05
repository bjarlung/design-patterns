package Behavioral.Visitor.withVisitor

//Concrete element
class Oil: AtvPart {
    override fun accept(visitor: AtvPartVisitor) {
        visitor.visit(this)
    }
}