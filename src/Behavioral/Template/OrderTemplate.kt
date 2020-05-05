package Behavioral.Template

abstract class OrderTemplate {

    //hook - could be overridden but doesn't have to be
    var isGift: Boolean = false //must be initialized in kotlin

    protected abstract fun doCheckout()
    protected abstract fun doPayment()
    protected abstract fun doReceipt()
    protected abstract fun doDelivery()

    private fun wrapGift() {
        println("Gift wrapped")
    }

    fun processOrder() {
        doCheckout()
        doPayment()
        if(isGift) {
            wrapGift()
        } else {
            doReceipt()
        }
        doDelivery()
    }
}