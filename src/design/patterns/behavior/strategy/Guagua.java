package design.patterns.behavior.strategy;

public class Guagua implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我在呱呱叫");
    }
}
