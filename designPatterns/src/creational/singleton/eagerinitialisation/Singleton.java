package creational.singleton.eagerinitialisation;

public class Singleton {

    //In this approach, the instance of the singleton class is created eagerly, i.e., when the class is loaded(as its static)
    //Drawback : Guarantees thread safety but result in unnecessary resource consumption if the instance is not always required.
    public static Singleton obj=new Singleton(); //eager initialization

    private Singleton(){  // Private constructor to prevent external instantiation
        System.out.println("instance");
    }

    public static Singleton getInstance(){
        return obj;
    }
}
