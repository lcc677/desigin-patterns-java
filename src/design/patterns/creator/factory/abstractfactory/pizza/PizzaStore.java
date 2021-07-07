package design.patterns.creator.factory.abstractfactory.pizza;


public abstract class PizzaStore {
    public Pizza orderPizza(String orderType) {
        Pizza pizza = createPizza(orderType);
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
    public abstract Pizza createPizza(String orderType);
}
