package design.patterns.behavior.decoratorandfactory;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDes("混合咖啡");
        setPrice(7f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
