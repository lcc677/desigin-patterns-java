package design.patterns.behavior.proxy.remote;

import java.util.Random;

// 有硬币状态
public class HasQuarterState implements State {
    Random random = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;


    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
        System.out.println("有硬币状态，你不需要再投币了！！！");

    }

    @Override
    public void ejectQuarter() {
        // TODO Auto-generated method stub
        System.out.println("有硬币状态，你要退回硬币..,我就变成无硬币状态了");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        System.out.println("有硬币状态，你要转动把手，我就要变成在售状态了。。。");
        int winner = random.nextInt(10);
        System.out.println(winner);
        System.out.println(winner % 10);
        if (winner % 10 == 0 && gumballMachine.getCount() > 1) {
            System.out.println("11111111111111");
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub
        System.out.println("有硬币状态，你要先转动把手，我才能发放糖果，。");

    }

}
