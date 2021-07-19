package design.patterns.behavior.decoratorandfactory;

public class MilkCondimentCreator implements CondimentCreator {

    @Override
    public CondimentDecorator createCondiment(Beverage beverage) {
        return new MilkCondiment(beverage);
    }
}

class MilkCondiment extends CondimentDecorator {
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
