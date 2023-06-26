package structural.decorator;

public class ChocolateCone implements IceCream{ //can be base or topping

    private  IceCream icecream;

    public ChocolateCone(IceCream icecream){   //topping
        this.icecream=icecream;
    }

    public ChocolateCone(){    // base

    }

    @Override
    public int getCost() {
        if(icecream==null) return 40;
        else return icecream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        if(icecream==null) return " ChocolateCone ";
        else return icecream.getDescription() + " ChocolateCone ";
    }
}
