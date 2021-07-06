package design.patterns.creator.factory.factorymethod;


public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "给北京希腊披萨准备原材料");
    }
}
