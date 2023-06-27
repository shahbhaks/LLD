package creational.singleton.enuminstance;

public class Client {
    public static void main(String[] args){

        Singleton obj1 = Singleton.INSTANCE;
        Singleton obj2 = Singleton.INSTANCE;

        System.out.println(obj1==obj2); //checks ref
    }
}
