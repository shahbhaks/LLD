package structural.decorator;

//Customize icecream
public class Client {
    public static void main(String[] args){

        IceCream icecream;
        icecream = new ChocoChip(
                                new VanillaScoop(
                                    new ChocolateScoop(
                                        new VanillaCone(
                                                new ChocoChip(
                                                    new ChocolateCone() )))));

        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());


    }
}
