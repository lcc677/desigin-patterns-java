package design.patterns.structure.decoratorandfactory;

public interface CondimentCreator {
    public abstract CondimentDecorator createCondiment(Beverage beverage);
}
