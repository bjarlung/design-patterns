package Behavioral.Template

class WebOrder: OrderTemplate() {
    override fun doCheckout() {
        println("Get items from cart")
        println("Set gift preferences")
        println("Set delivery address")
        println("Set billing address")
    }

    override fun doPayment() {
        println("Process payment without card present")
    }

    override fun doReceipt() {
        println("Email receipt")
    }

    override fun doDelivery() {
        println("Ship the item to address")
    }

}