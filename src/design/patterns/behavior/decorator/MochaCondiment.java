package design.patterns.behavior.decorator;

public class MochaCondiment extends CondimentDecorator{

    private Beverage beverage;

    public MochaCondiment(Beverage beverage) {
        this.beverage = beverage;
        setPrice(3.6f);
    }

    @Override
    public float cost() {
        return beverage.cost() + getPrice();
    }

    @Override
    public String getDes() {
        return beverage.getDes() + "添加了一份摩卡++++";
    }
}
