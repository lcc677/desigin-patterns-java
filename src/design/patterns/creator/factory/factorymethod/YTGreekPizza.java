package design.patterns.creator.factory.factorymethod;


public class YTGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "给烟台希腊披萨准备原材料");
    }
}
