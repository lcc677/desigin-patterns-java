package design.patterns.behavior.iterator.system;

import java.util.Iterator;

/**
 * description: Client
 * date: 2021/7/31 下午4:30
 * author: cc
 */
public class Client {
    static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            System.out.println("**************************************");
            System.out.println("菜单名称: " + menu.getName());
            System.out.println("--描述: " + menu.getDescription());
            System.out.println("--价格: " + menu.getPrice());
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------生成pizza店的菜单------------");
        Menu menu1 = new Menu("pizza菜单1", "pizza菜单1", 12.3f);
        Menu menu2 = new Menu("pizza菜单2", "pizza菜单2", 11.3f);
        Menu menu3 = new Menu("pizza菜单3", "pizza菜单3", 10.3f);
        Menu menu4 = new Menu("pizza菜单4", "pizza菜单4", 9.3f);

        Aggregate pizzaStoreAggregate = new PizzaStoreAggregate();
        pizzaStoreAggregate.add(menu1);
        pizzaStoreAggregate.add(menu2);
        pizzaStoreAggregate.add(menu3);
        pizzaStoreAggregate.add(menu4);

        System.out.println("-----------生成咖啡店的菜单---------------");
        Menu coffeeMenu1 = new Menu("咖啡菜单1", "咖啡菜单1", 12.3f);
        Menu coffeeMenu2 = new Menu("咖啡菜单2", "咖啡菜单2", 11.3f);
        Menu coffeeMenu3 = new Menu("咖啡菜单3", "咖啡菜单3", 10.3f);
        Menu coffeeMenu4 = new Menu("咖啡菜单4", "咖啡菜单4", 9.3f);

        Aggregate coffeeStoreAggregate = new CoffeeStoreAggregate();
        coffeeStoreAggregate.add(coffeeMenu1);
        coffeeStoreAggregate.add(coffeeMenu2);
        coffeeStoreAggregate.add(coffeeMenu3);
        coffeeStoreAggregate.add(coffeeMenu4);


        System.out.println("我打印pizza店的菜单");
        Iterator pizzaStoreIterator = pizzaStoreAggregate.getIterator();
        printMenu(pizzaStoreIterator);

        System.out.println("我打印咖啡店的菜单");
        Iterator coffeeStoreIterator = coffeeStoreAggregate.getIterator();
        printMenu(coffeeStoreIterator);


    }

}
