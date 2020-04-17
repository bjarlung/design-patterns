package Structural.Flyweight;

//Instances of Item will be the Flyweights
// Everything is final and immutable (no setters)
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
