package creational.singleton.lazyinitization;

public class Singleton {

    //In this approach, the instance is created lazily when it is requested for the first time.
    //Drawback : Not thread-safe
    //can lead to issues in a multi-threaded environment if multiple threads attempt to access the instance simultaneously.
    public static Singleton obj; //lazy initialization

    private Singleton(){  // Private constructor to prevent external instantiation
        System.out.println("instance");
    }

    public static Singleton getInstance(){
        if(obj==null){
            obj=new Singleton();
        }

        return obj;
    }
}
