package design.patterns.behavior.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Guagua();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("我是一只野鸭");
    }
}
