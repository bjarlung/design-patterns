package Behavioral.Visitor.withVisitor

//Element interface
interface AtvPart {
    fun accept(visitor: AtvPartVisitor)
}