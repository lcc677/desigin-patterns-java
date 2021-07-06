package design.patterns.creator.factory.abstractfactory.pizza;


import design.patterns.creator.factory.abstractfactory.pizzaingredient.BJPizzaIngredientFactory;
import design.patterns.creator.factory.abstractfactory.pizzaingredient.PizzaIngredientFactory;

public class BJPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String orderType) {
        PizzaIngredientFactory pizzaIngredientFactory = new BJPizzaIngredientFactory();
        Pizza pizza;
        if(orderType.equals("greek")){
            pizza = new BJGreekPizza(pizzaIngredientFactory);
            pizza.setName("北京希腊披萨");
        }else if (orderType.equals("chesse")){
            pizza = new BJCheesePizza(pizzaIngredientFactory);
            pizza.setName("北京奶酪披萨");
        }else {
            pizza = null;
            System.out.println("输入披萨类型错误");
        }
        return pizza;
    }
}
