package design.patterns.creator.factory.factorymethod;


import design.patterns.creator.factory.simplefactory.CheesePizza;
import design.patterns.creator.factory.simplefactory.GreekPizza;

public class BJPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
            pizza.setName("北京希腊披萨");
        }else if (orderType.equals("chesse")){
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        }else {
            pizza = null;
            System.out.println("输入披萨类型错误");
        }
        return pizza;
    }
}
