package Behavioral.Template

class StoreOrder: OrderTemplate() {
    override fun doCheckout() {
        println("Bring up items from cart")
    }

    override fun doPayment() {
        println("Process payment with card present")
    }

    override fun doReceipt() {
        println("Print receipt")
    }

    override fun doDelivery() {
        println("Bag items at counter")
    }

}