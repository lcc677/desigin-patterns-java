package design.patterns.behavior.strategy;

public class Zhizhi implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("我在吱吱叫");
    }
}
