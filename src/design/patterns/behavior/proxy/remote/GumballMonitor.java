package design.patterns.behavior.proxy.remote;

/**
 * description: GumballMonitor
 * date: 2021/8/10 下午4:46
 * author: cc
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.print(gumballMachine.getLocation() + "号机器:");
            System.out.print("库存-->" + gumballMachine.getCount());
            System.out.println("当前状态-->" + gumballMachine.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
