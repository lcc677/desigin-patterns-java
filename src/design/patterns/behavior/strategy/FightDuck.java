package design.patterns.behavior.strategy;

public class FightDuck extends Duck {

    public FightDuck() {
        quackBehavior = new Zhizhi();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("我是一只战斗鸭");
    }
}
