package Behavioral.Visitor.withVisitor

class PartsOrder: AtvPart {
    private var parts: MutableList<AtvPart> = mutableListOf()

    fun addPart(vararg atvPart1: AtvPart) = atvPart1.map { parts.add(it) }

    fun getParts(): List<AtvPart> = parts.toList()


    override fun accept(visitor: AtvPartVisitor) {
        parts.forEach{ it.accept(visitor)}
        visitor.visit(this)
    }

}