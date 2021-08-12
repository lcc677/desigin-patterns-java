package design.patterns.behavior.state;

public class Client {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


    }

}
