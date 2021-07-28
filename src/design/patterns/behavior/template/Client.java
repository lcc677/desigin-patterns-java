package design.patterns.behavior.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("我去冲杯咖啡");
        Beverage coffee = new Coffee();
        coffee.prepareDrink();
        System.out.println("------------------------------");
        System.out.println("我去泡壶茶");
        Beverage tea = new Tea();
        tea.prepareDrink();
        System.out.println("------------------------------");
    }
}
