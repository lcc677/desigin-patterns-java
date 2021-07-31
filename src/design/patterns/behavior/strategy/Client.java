package design.patterns.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck fightDuck = new FightDuck();
        fightDuck.performQuack();
        fightDuck.performFly();

        System.out.println("我是一直有梦想的战斗呀,你不让我飞,我动态改变我的飞行算法.我现在也可以飞了");
        fightDuck.setFlyBehavior(new FlyWithWings());
        fightDuck.performFly();
    }
}
