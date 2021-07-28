package design.patterns.behavior.template;

public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("我用水冲咖啡");
    }

    @Override
    public void addCondiment() {
        System.out.println("我要添加牛奶和糖");
    }
}
