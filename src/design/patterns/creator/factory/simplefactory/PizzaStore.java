package design.patterns.creator.factory.simplefactory;

public class PizzaStore {
    SimpleFactory simpleFactory;
    public PizzaStore(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }
    public Pizza orderPizza(String orderType) {
        Pizza pizza = simpleFactory.createPizza(orderType);
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimpleFactory());
        Pizza pizza = pizzaStore.orderPizza("chesse");
    }
}
