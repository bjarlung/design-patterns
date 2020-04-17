package Structural.Composite;

import java.util.Iterator;

//Composite in the UML
//Contains stuff refering to the children and how we can add and remove things
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponets.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponets.remove(menuComponent);
        return menuComponent;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> itr = menuComponets.iterator();
        while(itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
