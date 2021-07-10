package design.patterns.creator.builder.builderhouse;

public class BuilderTest {
    public static void main(String[] args) {
        // 创建一个木屋
        System.out.println("创建一个木屋");
        Builder builder = new WoodenHouseBuilder();

        Director director = new Director(builder);
        House house = director.constructHouse();
        System.out.println("木房子的地基:" + house.getBasis());
        System.out.println("木房子的墙:" + house.getWall());
        System.out.println("木房子的屋顶:" + house.getRoof());


        System.out.println("创建一个高楼");
        director.setBuilder(new HeightHouseBuilder());
        House heightHouse = director.constructHouse();
        System.out.println("高楼的地基:" + heightHouse.getBasis());
        System.out.println("高楼的墙:" + heightHouse.getWall());
        System.out.println("高楼的屋顶:" + heightHouse.getRoof());


    }
}
