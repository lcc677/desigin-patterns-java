package design.patterns.behavior.proxy.remote;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/gumballMachine");
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
            gumballMonitor.report();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
