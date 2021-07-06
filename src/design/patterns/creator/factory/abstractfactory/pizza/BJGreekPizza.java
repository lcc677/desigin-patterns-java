package design.patterns.creator.factory.abstractfactory.pizza;


import design.patterns.creator.factory.abstractfactory.pizzaingredient.PizzaIngredientFactory;

public class BJGreekPizza extends Pizza {
    public BJGreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        douch = pizzaIngredientFactory.createDouch();
        sause = pizzaIngredientFactory.createSause();
        System.out.println(name + "给北京希腊披萨准备原材料" + "用了" + douch.getName() + "  用了:" + sause.getName());
    }
}
