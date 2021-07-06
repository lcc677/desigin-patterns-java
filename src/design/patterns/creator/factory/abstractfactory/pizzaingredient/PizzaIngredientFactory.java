package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public interface PizzaIngredientFactory {
    abstract Douch createDouch();
    abstract Sause createSause();
}
