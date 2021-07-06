package design.patterns.creator.factory.factorymethod;


public class YTCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "给烟台奶酪披萨准备原材料");
    }
}
