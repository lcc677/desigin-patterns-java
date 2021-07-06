package design.patterns.creator.factory.abstractfactory;


import design.patterns.creator.factory.abstractfactory.pizza.BJPizzaStore;
import design.patterns.creator.factory.abstractfactory.pizza.PizzaStore;

public class PizzaStoreTest {
    public static void main(String[] args) {
        System.out.println("我要吃北京奶酪披萨");
        PizzaStore pizzaStore = new BJPizzaStore();
        pizzaStore.orderPizza("chesse");
    }
}
