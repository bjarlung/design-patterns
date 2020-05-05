package Behavioral.Template

fun main() {

    println("Web order:")

    val webOrder: OrderTemplate = WebOrder()
    webOrder.processOrder()

    println("\nStore Order:")

    val storeOrder: OrderTemplate = StoreOrder()
    storeOrder.isGift = true
    storeOrder.processOrder()



}