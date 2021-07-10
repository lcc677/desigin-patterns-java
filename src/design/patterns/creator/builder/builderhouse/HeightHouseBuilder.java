package design.patterns.creator.builder.builderhouse;

public class HeightHouseBuilder implements Builder{
    House house  = new House();
    @Override
    public void buildBasis() {
        System.out.println("创建高楼的地基");
        house.setBasis("高楼的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("创建高楼的墙");
        house.setWall("高楼的墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("创建高楼的屋顶");
        house.setRoof("高楼的屋顶");
    }

    @Override
    public House getProduct() {
        return house;
    }
}
