package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public abstract class Douch {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void make();
}
