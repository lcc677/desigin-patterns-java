package design.patterns.creator.builder.buildercars;

public class Engine {
    String name;
    public Engine(){
        this.name = "我是个发动机";
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
