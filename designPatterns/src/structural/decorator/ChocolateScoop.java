package structural.decorator;

public class ChocolateScoop implements IceCream{ //only be a topping

    private IceCream icecream;

    public ChocolateScoop(IceCream icecream){ //topping
        this.icecream=icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 65;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " ChocolateScoop ";
    }
}
