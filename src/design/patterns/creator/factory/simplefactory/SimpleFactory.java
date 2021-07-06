package design.patterns.creator.factory.simplefactory;


public class SimpleFactory {

    public Pizza createPizza(String orderType){
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
        return pizza;
    }
}
