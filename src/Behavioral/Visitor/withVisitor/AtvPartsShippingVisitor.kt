package Behavioral.Visitor.withVisitor

class AtvPartsShippingVisitor: AtvPartVisitor {

    var shippingAmount = 0.0

    override fun visit(fender: Fender) {
        println("Fenders are light and cheap to ship")
        shippingAmount += 3
    }

    override fun visit(oil: Oil) {
        println("Oil i hazardous and has a fee to ship")
        shippingAmount += 9
    }

    override fun visit(wheel: Wheel) {
        println("Wheels are bulky and expensive to ship")
        shippingAmount += 15.0
    }

    override fun visit(partsOrder: PartsOrder) {
        println("If they bought more than 3 things we will give them a discount on shipping")

        val parts: List<AtvPart> = partsOrder.getParts()
        if(parts.size > 3) {
            shippingAmount -= 5
        }
        println("Shipping amount is: $shippingAmount")

    }

}