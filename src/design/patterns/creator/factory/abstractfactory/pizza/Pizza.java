package design.patterns.creator.factory.abstractfactory.pizza;

import design.patterns.creator.factory.abstractfactory.pizzaingredient.Douch;
import design.patterns.creator.factory.abstractfactory.pizzaingredient.PizzaIngredientFactory;
import design.patterns.creator.factory.abstractfactory.pizzaingredient.Sause;

public abstract class Pizza {
    protected String name;
    public Douch douch;
    public Sause sause;
    public PizzaIngredientFactory pizzaIngredientFactory;
    public Pizza(){}
    public abstract void prepare();
    public void bake(){
        System.out.println(name + "baking");
    }
    public void cut(){
        System.out.println(name + "cuting");
    }
    public void box(){
        System.out.println(name + "boxing");
    }
    public void setName(String name){
        this.name = name;
    }
}
