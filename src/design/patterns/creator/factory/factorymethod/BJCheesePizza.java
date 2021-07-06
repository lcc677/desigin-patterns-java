package design.patterns.creator.factory.factorymethod;


public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "给北京奶酪披萨准备原材料");
    }
}
