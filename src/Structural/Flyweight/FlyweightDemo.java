package Structural.Flyweight;

public class FlyweightDemo {

    /*
        Inventory Management system
        Client
        Catalog (contains factory of flyweights)
        Order
        Item (Implementation of flyweight / concrete flyweights
     */

    public static void main(String[] args) {

        InventorySystem ims  = new InventorySystem();

        ims.takeOrder("Headphones", 221);
        ims.takeOrder("Pen", 5);
        ims.takeOrder("Samsung TV", 34);
        ims.takeOrder("Samsung TV", 78);
        ims.takeOrder("Headphones", 4);
        ims.takeOrder("Pen", 45);
        ims.takeOrder("Samsung TV", 78);

        ims.process();

        System.out.println(ims.report());

        //We have all of out orders but we only made three objects

    }
}
