package design.patterns.behavior.decoratorandfactory;

public interface CondimentCreator {
    public abstract CondimentDecorator createCondiment(Beverage beverage);
}
