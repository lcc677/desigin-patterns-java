package design.patterns.behavior.decorator;

public class MilkCondiment extends CondimentDecorator {
    Beverage beverage;

    public MilkCondiment(Beverage beverage) {
        this.beverage = beverage;
        setPrice(2.3f);

    }

    @Override
    public float cost() {
        return beverage.cost() + getPrice();
    }

    @Override
    public String getDes() {
        return beverage.getDes() + "添加了一份牛奶+++";
    }
}
