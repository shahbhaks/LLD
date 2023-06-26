package structural.decorator;

public class OrangeCone implements IceCream{ //can be base or topping
    private  IceCream icecream;

    public OrangeCone(IceCream icecream){   //topping
        this.icecream=icecream;
    }

    public OrangeCone(){    // base

    }

    @Override
    public int getCost() {
        if(icecream==null) return 20;
        else return icecream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        if(icecream==null) return " OrangeCone ";
        else return icecream.getDescription() + " OrangeCone ";
    }
}
