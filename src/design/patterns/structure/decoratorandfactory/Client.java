package design.patterns.structure.decoratorandfactory;

public class Client {
    public static void main(String[] args) {
        // 我要一杯浓缩咖啡,加豆浆,加摩卡,加两份牛奶

        Beverage order = BeverageFactory.createBeverage("Espresso");

        CondimentCreator condimentCreator = new SoyCondimentCreator();
        order = condimentCreator.createCondiment(order);
        condimentCreator = new MochaCondimentCreator();
        order = condimentCreator.createCondiment(order);
        condimentCreator = new MilkCondimentCreator();
        order = condimentCreator.createCondiment(order);
        order = condimentCreator.createCondiment(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());

    }
}
