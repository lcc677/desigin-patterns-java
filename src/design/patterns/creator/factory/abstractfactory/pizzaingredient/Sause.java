package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public abstract class Sause {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void make();
}
