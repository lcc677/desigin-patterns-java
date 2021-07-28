package design.patterns.structure.template;

public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("我用水泡茶");
    }

    @Override
    public void addCondiment() {
        System.out.println("我添加了柠檬汁");
    }
}
