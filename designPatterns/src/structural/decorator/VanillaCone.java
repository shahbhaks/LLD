package structural.decorator;

public class VanillaCone implements IceCream{ //can be base or topping
    private  IceCream icecream;

    public VanillaCone(IceCream icecream){   //topping
        this.icecream=icecream;
    }

    public VanillaCone(){    // base

    }

    @Override
    public int getCost() {
        if(icecream==null) return 30;
        else return icecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        if(icecream==null) return " VanillaCone ";
        else return icecream.getDescription() + " VanillaCone ";
    }
}
