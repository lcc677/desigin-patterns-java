package design.patterns.creator.builder.buildercars;

public class CarsBuilder implements Builder{
    Computer computer;
    Engine engine;

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cars getProduct() {
        return new Cars(computer,engine);
    }
}
