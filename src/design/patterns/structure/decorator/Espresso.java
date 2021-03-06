package design.patterns.structure.decorator;

public class Espresso extends Beverage{
    public Espresso() {
        setDes("浓缩咖啡");
        setPrice(6f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
