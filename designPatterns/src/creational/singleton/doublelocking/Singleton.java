package creational.singleton.doublelocking;

public class Singleton {

    //Pros : thread-safe
    //This can be useful in situations where multiple threads are accessing shared resources,
    // and you want to prevent them from interfering with each other.
    public static Singleton obj; //lazy initialization

    private Singleton(){  // Private constructor to prevent external instantiation
        System.out.println("instance");
    }

    public static Singleton getInstance(){
        if(obj==null){  // Check if an instance already exists
            synchronized (Singleton.class){ // Synchronize on the class object
                if(obj==null){ // Double-check within the synchronized block
                    obj=new Singleton(); // Create a new instance if it doesn't exist
                }
            }

        }
        return obj;
    }
}
