package design.patterns.creator.factory.commonImplement;

public class PizzaStore {

    public static void orderPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if (orderType.equals("chesse")){
            pizza = new CheesePizza();
            pizza.setName("chesse");
        }else {
            pizza = null;
        }
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    public static void main(String[] args) {
        orderPizza("greek");
    }
}
