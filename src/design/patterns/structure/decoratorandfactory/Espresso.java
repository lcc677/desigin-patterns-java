package design.patterns.structure.decoratorandfactory;

public class Espresso extends Beverage {
    public Espresso() {
        setDes("浓缩咖啡");
        setPrice(6f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
