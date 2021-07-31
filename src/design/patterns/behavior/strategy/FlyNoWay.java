package design.patterns.behavior.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        /// nothing,我不会飞
        System.out.println("我不会飞");
    }
}
