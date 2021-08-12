package design.patterns.behavior.proxy.remote;

import java.rmi.Naming;

/**
 * description: Server
 * date: 2021/8/11 下午1:31
 * author: cc
 */
public class Server {
    public static void main(String[] args) {
        try {
            String location = "127.0.0.1";
            GumballMachineRemote gumballMachine1 = new GumballMachine(10, location);
            Naming.rebind("//" + location + "/gumballMachine", gumballMachine1);

//            GumballMachine gumballMachine2 = new GumballMachine(10,"北京西路");
//            GumballMachine gumballMachine3 = new GumballMachine(10,"北京南路");
//            GumballMachine gumballMachine4 = new GumballMachine(10,"北京北路");
//            GumballMachine gumballMachine5 = new GumballMachine(10,"北京中路");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
