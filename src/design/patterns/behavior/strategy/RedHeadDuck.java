package design.patterns.behavior.strategy;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehavior = new Guagua();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("我是一只红头鸭子");
    }
}
