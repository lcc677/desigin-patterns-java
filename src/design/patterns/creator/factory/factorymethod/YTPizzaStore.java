package design.patterns.creator.factory.factorymethod;

public class YTPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza;
        if(orderType.equals("greek")){
            pizza = new YTGreekPizza();
            pizza.setName("烟台希腊披萨");
        }else if (orderType.equals("chesse")){
            pizza = new YTCheesePizza();
            pizza.setName("烟台奶酪披萨");
        }else {
            pizza = null;
            System.out.println("输入披萨类型错误");
        }
        return pizza;
    }
}
