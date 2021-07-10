package design.patterns.creator.builder.buildercars;

public class Cars {
    private Computer computer;
    private Engine engine;

    public Cars(Computer computer,Engine engine){
        this.computer = computer;
        this.engine = engine;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "汽车:{" +
                "computer=" + computer +
                ", engine=" + engine +
                '}';
    }
}
