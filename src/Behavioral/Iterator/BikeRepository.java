package Behavioral.Iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {
        if(index == bikes.length) { //om det behövs så skapas en större array som ersätter den gammla
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null ;
            }

            @Override
            public String next() {
                return bikes[currentIndex++]; //returns first then increments the counter
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }
}


