package design.patterns.creator.builder.buildercars;

public class Director {

    public void constructCars(Builder builder){
        builder.setComputer(new Computer());
        builder.setEngine(new Engine());
    }

}
