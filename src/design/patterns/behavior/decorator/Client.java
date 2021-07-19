package design.patterns.behavior.decorator;

public class Client {
    public static void main(String[] args) {
        // 我要一杯浓缩咖啡,加豆浆,加摩卡,加两份牛奶

        Beverage order = new Espresso();

        order = new SoyCondiment(order);
        order = new MochaCondiment(order);
        order = new MilkCondiment(order);
        order = new MilkCondiment(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());

    }
}
