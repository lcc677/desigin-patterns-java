package design.patterns.creator.builder.buildercars;

public class CarsManual {
    private Computer computer;
    private Engine engine;

    public CarsManual(Computer computer, Engine engine) {
        this.computer = computer;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "汽车使用说明书:{" +
                "computer=" + computer +
                ", engine=" + engine +
                '}';
    }
}
