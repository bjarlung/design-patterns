package Behavioral.Visitor.withoutVisitor

class PartsOrder: AtvPart {
    private var parts: MutableList<AtvPart> = mutableListOf()

    fun addPart(vararg atvPart: AtvPart) = atvPart.map { parts.add(it) }

    fun getParts(): List<AtvPart> = parts.toList()

    override fun calculateShipping(): Double =
            parts.fold(0.0){ acc, part -> acc + part.calculateShipping()}


}