package design.patterns.structure.bridge;

/**
 * description: ConcreteRemote1
 * date: 2021/8/21 下午5:20
 * author: cc
 */
public class ConcreteRemote1 extends Remote {
    public ConcreteRemote1(Driver driver) {
        super(driver);
    }
    public void on(){
        super.on();
        System.out.println("我用遥控器1打开了设备");
    }
    public void off(){
        super.off();
        System.out.println("我用遥控器1关闭了设备");
    }
    public void change(){
        super.change();
        System.out.println("我用遥控器1换台了");
    }
}
