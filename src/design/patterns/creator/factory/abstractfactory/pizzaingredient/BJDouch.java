package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public class BJDouch extends Douch{
    @Override
    public void make() {
        System.out.println("我要做北京面团");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
