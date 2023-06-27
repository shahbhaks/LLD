package creational.singleton.synchronizedblock;

public class Singleton {

    //Only one thread can execute getInstance() at a time.
    // When a thread enters the getInstance() method, it acquires the lock on the obj,
    // and other threads attempting to access the method will be blocked,until the lock is released.

    //Pros : thread-safe
    //Con : using synchronized at the method level can introduce a performance overhead,
    // as the lock is held for the entire duration of the method, even if the instance has already been created.
    public static Singleton obj; //lazy initialization

    private Singleton(){  // Private constructor to prevent external instantiation
        System.out.println("instance");
    }

    public static synchronized Singleton getInstance(){
        if(obj==null){
            obj=new Singleton();
        }

        return obj;
    }
}
