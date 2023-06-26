package structural.decorator;

public class VanillaScoop implements IceCream{ //only be a topping
    private IceCream icecream;

    public VanillaScoop(IceCream icecream){ //topping
        this.icecream=icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 55;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " VanillaScoop ";
    }
}
