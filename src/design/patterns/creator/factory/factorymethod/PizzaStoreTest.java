package design.patterns.creator.factory.factorymethod;

public class PizzaStoreTest {
    public static void main(String[] args) {
        System.out.println("我想吃北京的希腊披萨");
        PizzaStore pizzaStore = new BJPizzaStore();
        pizzaStore.orderPizza("greek");
        System.out.println("-----------------------------------------------------------");

        System.out.println("我想吃烟台的奶酪披萨");
        PizzaStore pizzaStore1 = new YTPizzaStore();
        pizzaStore1.orderPizza("chesse");
        System.out.println("-----------------------------------------------------------");

    }
}
