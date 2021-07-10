package design.patterns.creator.builder.buildercars;

public class Demo {
    public static void main(String[] args) {

        // 创建汽车
        CarsBuilder builder = new CarsBuilder();
        Director director = new Director();
        director.constructCars(builder);
        Cars cars = builder.getProduct();
        System.out.println(cars);


        // 创建汽车说明书
        CarsManualBuilder builder2 = new CarsManualBuilder();
        Director director2 = new Director();
        director2.constructCars(builder2);
        CarsManual carsManual = builder2.getProduct();
        System.out.println(carsManual);
    }
}
