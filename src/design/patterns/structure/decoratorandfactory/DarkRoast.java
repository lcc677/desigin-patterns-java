package design.patterns.structure.decoratorandfactory;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        setDes("深焙咖啡");
        setPrice(5f);
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
