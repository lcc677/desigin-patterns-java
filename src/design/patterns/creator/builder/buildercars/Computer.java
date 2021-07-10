package design.patterns.creator.builder.buildercars;

public class Computer {
    String size;
    public Computer(){
        this.size = "我只是个中控";
    }

    @Override
    public String toString() {
        return "Computer{" +
                "size='" + size + '\'' +
                '}';
    }
}
