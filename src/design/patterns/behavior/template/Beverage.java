package design.patterns.behavior.template;

public abstract class Beverage {
    public void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();

    }

    public void boilWater() {
        System.out.println("煮沸水!");
    }

    abstract void brew();

    public void pourInCup() {
        System.out.println("我将制作好的饮料倒入杯中");
    }

    abstract public void addCondiment();
}
