package design.patterns.structure.decoratorandfactory;

public class BeverageFactory {
    public static Beverage createBeverage(String beverageType){
        Beverage beverage;
        if ("DarkRoast".equals(beverageType)){
            beverage = new DarkRoast();
        }else if ("Espresso".equals(beverageType)){
            beverage =  new Espresso();
        }else if("HouseBlend".equals(beverageType)){
            beverage = new HouseBlend();
        }else {
            System.out.println("没有找到咖啡类型");
            beverage = null;
        }
        return beverage;
    }
}
