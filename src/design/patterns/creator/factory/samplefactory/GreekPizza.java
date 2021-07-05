package design.patterns.creator.factory.samplefactory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "给希腊披萨准备原材料");
    }
}
