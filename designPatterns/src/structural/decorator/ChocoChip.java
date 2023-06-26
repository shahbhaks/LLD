package structural.decorator;

public class ChocoChip implements IceCream{ //only be a topping
    private IceCream icecream;

    public ChocoChip(IceCream icecream){ //topping
        this.icecream=icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 45;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " ChocoChip ";
    }
}
