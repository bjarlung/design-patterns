package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Frida");
        names.add("Hasse");
        names.add("Ida");

        Iterator<String> namesItr = names.iterator();

       /* while(namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        */

        //for each använder en iterator
        for (String name: names ) {
            System.out.println(name);
            //names.remove(name); kan dock inte ta bort!
        }
        System.out.println("Names size " + names.size());
    }

}
