package Creational.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(755);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory2.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
