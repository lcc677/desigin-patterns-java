package design.patterns.structure.bridge;

/**
 * description: Client
 * date: 2021/8/21 下午5:23
 * author: cc
 */
public class Client {
    public static void main(String[] args) {


        Remote remote1 = new ConcreteRemote1(new HasenTV());
        remote1.on();
        remote1.change();
        remote1.off();

        System.out.println("-------------------------------");
        remote1.setDriver(new XiapuTV());
        remote1.on();
        remote1.change();
        remote1.off();


    }
}
