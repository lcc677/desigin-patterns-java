package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public class BJPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Douch createDouch() {
        Douch douch = new BJDouch();
        douch.setName("北京面团");
        return douch;
    }

    @Override
    public Sause createSause() {
        Sause sause = new BJSause();
        sause.setName("北京酱");
        return sause;
    }
}
