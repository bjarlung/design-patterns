package Structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        //adding functionality to the simple sandwich
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}

