package design.patterns.behavior.decoratorandfactory;

public class SoyCondimentCreator implements CondimentCreator {

    @Override
    public CondimentDecorator createCondiment(Beverage beverage) {
        return new SoyCondiment(beverage);
    }
}

class SoyCondiment extends CondimentDecorator {
    Beverage beverage;

    public SoyCondiment(Beverage beverage) {
        this.beverage = beverage;
        setPrice(1.8f);
    }

    @Override
    public float cost() {
        return beverage.cost() + getPrice();
    }

    @Override
    public String getDes() {
        return beverage.getDes() + "添加了一份豆浆+++";
    }
}
