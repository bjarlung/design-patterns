package Structural.Flyweight;

// Just a class in our application
// Order consumes Items
// Orders can be changed, items cannot be changed
public class Order {
    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item +
                " for order number: " + orderNumber);
    }
}