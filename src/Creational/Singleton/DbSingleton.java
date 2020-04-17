package Creational.Singleton;

public class DbSingleton {

    // volatile = instance will remain a singleton throughout JVM
    private static volatile DbSingleton instance = null;

    private DbSingleton(){
        //make sure noone uses reflection on out code
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            // implement a double check locking mechanism & a synchronized check
            // it may be null but if two threads are going on it together
            // synchronize and check for null again
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
