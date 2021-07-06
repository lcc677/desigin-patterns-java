package design.patterns.creator.factory.abstractfactory.pizza;

import design.patterns.creator.factory.abstractfactory.pizzaingredient.PizzaIngredientFactory;
import design.patterns.creator.factory.abstractfactory.pizzaingredient.YTPizzaIngredientFactory;

public class YTPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        PizzaIngredientFactory  pizzaIngredientFactory = new YTPizzaIngredientFactory();
        if(orderType.equals("greek")){
            pizza = new YTGreekPizza(pizzaIngredientFactory);
            pizza.setName("烟台希腊披萨");
        }else if (orderType.equals("chesse")){
            pizza = new YTCheesePizza(pizzaIngredientFactory);
            pizza.setName("烟台奶酪披萨");
        }else {
            pizza = null;
            System.out.println("输入披萨类型错误");
        }
        return pizza;
    }
}
