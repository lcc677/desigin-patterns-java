package design.patterns.creator.factory.abstractfactory.pizzaingredient;

public class YTPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Douch createDouch() {
        Douch douch = new YTDouch();
        douch.setName("烟台面团");
        return douch;
    }

    @Override
    public Sause createSause() {
        Sause sause = new YTSause();
        sause.setName("烟台酱");
        return sause;
    }
}
