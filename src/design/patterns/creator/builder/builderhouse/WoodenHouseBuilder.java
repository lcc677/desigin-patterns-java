package design.patterns.creator.builder.builderhouse;

public class WoodenHouseBuilder implements Builder {
    House house = new House();
    @Override
    public void buildBasis() {
        System.out.println("创建木屋的屋顶");
        house.setBasis("木屋屋顶");
    }

    @Override
    public void buildWall() {
        System.out.println("创建木屋的墙");
        house.setWall("木屋的墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("创建木屋的屋顶");
        house.setRoof("木屋的屋顶");
    }

    @Override
    public House getProduct() {
        return house;
    }
}
