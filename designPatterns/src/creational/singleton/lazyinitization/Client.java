package creational.singleton.lazyinitization;


public class Client {
    public static void main(String[] args){

//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//
//       // System.out.println(obj1==obj2); //== compares object references for equality,

        //to check not thread safe
        Thread t1=new Thread(new Runnable(){     //annonymous class
            public void run(){
                Singleton obj1 = Singleton.getInstance();
            }

        });
        Thread t2=new Thread(new Runnable(){     //annonymous class
            public void run(){
                Singleton obj2 = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start(); //creates two instance




    }
}
