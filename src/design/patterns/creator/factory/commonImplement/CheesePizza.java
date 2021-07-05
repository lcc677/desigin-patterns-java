package design.patterns.creator.factory.commonImplement;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + "给奶酪披萨准备原材料");
    }
}
